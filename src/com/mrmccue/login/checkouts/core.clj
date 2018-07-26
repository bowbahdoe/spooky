(ns com.mrmccue.login.checkouts.core
  (:import [java.time Instant Duration]
           [java.time.temporal ChronoUnit])
  (:require [clojure.pprint :refer [pprint]]
            [clojure.test :refer [deftest testing is]]))

(defrecord LiveServerState
  [active-checkouts
   available-credentials])
;; A LiveServerState is a
;; -- (LiveServerState. |List Checkout| CredentialRecord)

;; ----------------------------------------------------------------------------
(defrecord Checkout
  [user
   site
   credential
   last-renewed])
;; A Checkout is a
;; -- (Checkout. UserID SiteName Credential js/Date)

;; ----------------------------------------------------------------------------
(defrecord Site
  [name
   domain
   credentials])
;; A Site is a
;; -- (Site. SiteName String |List Credential|)

;; ----------------------------------------------------------------------------
;; A Credential is a
;; -- |Map Keyword String|

;; ----------------------------------------------------------------------------
;; A CredentialRecord is a
;; --  |Map SiteName |List Credential||

;; ----------------------------------------------------------------------------
;; A SiteName is one of
;; -- :NEJM
;; -- :WSJ
;; -- :RBC
;; -- :STATP

;; ----------------------------------------------------------------------------
;; A UserID is a Unique string representing a user

;; ----------------------------------------------------------------------------
;; A Request is the Express Request object

;; ----------------------------------------------------------------------------
;; A Response is the Express Response object

;; ----------------------------------------------------------------------------
;; |X| an |Optional X| is one of
;; -- X
;; -- nil

;; ============================================================================
;; CONSTANTS
;; ============================================================================
(def SITES
  #{{:name :NEJM
     :credentials (list {:login ""
                         :password "" },
                         {:login ""
                          :password ""})}
    {:name :GOOGLE
     :credentials (list {:username ""
                         :password ""})}})

(def CREDENTIALS
  (into {}
        (for [site SITES]
          [(:name site) (:credentials site)])))

(def +initial-state+
  {:active-checkouts ()
   :available-credentials CREDENTIALS})

(def +default-checkout-expiration+ (Duration/of 1 ChronoUnit/HOURS)) ;; 1 Hour

(def CURRENT-STATE (atom +initial-state+))

;; ============================================================================
;; == LOGIC ==
;; ============================================================================
(add-watch CURRENT-STATE :backup
           (fn [_ _ old-state new-state]
             (when (not= old-state new-state)
               (println "Backing up the new state"))))

;; ----------------------------------------------------------------------------
(defn site-available?
  "Returns if there are credentials available for the given site."
  [live-state site-name]
  (let [unused-creds (get (:available-credentials live-state) site-name)]
    (not (or (nil? unused-creds) (empty? unused-creds)))))

;; ----------------------------------------------------------------------------
(defn user-has-no-checkout-on-site?
  "Returns if the user has no checkout on the given site"
  [live-state user site-name]
  (let [checkouts (:active-checkouts live-state)
        has-checkout-on-site
          (fn [checkout] (and (= user (:user checkout))
                              (= site-name (:site checkout))))]
    (empty? (filter has-checkout-on-site checkouts))))

;; ----------------------------------------------------------------------------
;; LiveServerState, SiteName -> |List CredentialRecord|
(defn get-available-credentials-for-site [live-state site-name]
  (get-in live-state [:available-credentials site-name] '()))

;; ----------------------------------------------------------------------------
;; LiveServerState, UserID, SiteName -> '(|Optional CredentialRecord| LiveServerState)
(defn user-make-checkout [live-state user site-name]
  (let [creds (get-available-credentials-for-site live-state site-name)]
    (if (empty? creds)
      (list nil live-state)
      (let [popped-credential (first creds)]
        (list popped-credential
              (-> live-state
                (update-in [:available-credentials site-name] #(rest %))
                (update :active-checkouts #(conj % (Checkout. user
                                                              site-name
                                                              popped-credential
                                                              (Instant/now))))))))))
;; ----------------------------------------------------------------------------
;; LiveServerState, UserID, SiteName -> Boolean
(defn can-make-checkout? [live-state user site-name]
  (and (site-available? live-state site-name)
       (user-has-no-checkout-on-site? live-state user site-name)))

;; ----------------------------------------------------------------------------
(defn refresh-checkouts-by-criteria
  "Refreshes any checkouts that fit the given criteria function"
  [live-state criteria]
  (update live-state :active-checkouts
          (fn [active-checkouts]
            (map (fn [checkout]
                   (if (criteria checkout)
                     (assoc checkout :last-renewed (Instant/now))
                     checkout))
                 active-checkouts))))

;; ----------------------------------------------------------------------------
;; LiveServerState, UserID -> LiveServerState
;; Takes in a UserID and refreshes any checkouts that the user has
(defn refresh-checkouts-for-user [live-state user]
  (refresh-checkouts-by-criteria live-state #(= user (:user %))))

;; ----------------------------------------------------------------------------
;; LiveServerState, UserID, SiteName -> LiveServerState
;; Takes in a UserID and a specific SiteName and refreshes any checkouts
;; the user has on that site
(defn refresh-checkout-on-site [live-state user site-name]
  (refresh-checkouts-by-criteria live-state #(and (= user (:user %))
                                                  (= site-name (:site %)))))

;; ----------------------------------------------------------------------------
(defn expired-checkout?
  "Returns if the given checkout is expired"
  [checkout expire-after]
  (.isAfter (Instant/now)
            (.plus (:last-renewed checkout) expire-after)))

;; ----------------------------------------------------------------------------
;; Checkout, CredentialRecord -> CredentialRecord
;; Adds the credentials from a checkout back into a CredentialRecord
(defn reshuffle-checkout [checkout record]
  (let [site-name (:site checkout)
        credential (:credential checkout)]
    (if (contains? record site-name)
      (update record site-name #(conj % credential))
      (assoc record site-name (list credential)))))

;; ----------------------------------------------------------------------------
;; |List Checkout| CredentialRecord -> CredentialRecord
;; Adds the credentials from a list of checkouts back into a CredentialRecord
(defn reshuffle-checkouts [checkouts record]
  (if (empty? checkouts)
    record
    (recur (rest checkouts)
           (reshuffle-checkout (first checkouts)
                               record))))

;; LiveServerState, |Checkout -> Boolean| -> LiveServerState
;; Returns a new LiveServerState with all Checkouts that pass the criteria
;; function released and their credentials readded to the pool
(defn release-checkouts-by-criteria [state criteria]
  (let [currently-active (:active-checkouts state)
        expired (filter criteria currently-active)
        active (filter (complement criteria) currently-active)]
    (-> state
        (assoc :active-checkouts active)
        (update :available-credentials (partial reshuffle-checkouts expired)))))

;; ----------------------------------------------------------------------------
;; LiveServerState, Interval -> LiveServerState
;; Returns a new LiveServerState with all checkouts that should be expired
;; released and their credentials readded to the pool
(defn expire-checkouts [state expire-after]
  (release-checkouts-by-criteria state #(expired-checkout? % expire-after)))

;; ----------------------------------------------------------------------------
;; LiveServerState, UserID, SiteName -> LiveServerState
;; Releases Checkouts on the given SiteName for the given user
(defn release-site [state user site-name]
  (release-checkouts-by-criteria state #(and (= user (:user %))
                                             (= site-name (:site %)))))

;; ============================================================================
;; == TESTS ==
;; ============================================================================

(deftest expired-checkout-tests
  (testing "That a checkout that was made awhile ago is expired"
    (is (expired-checkout? {:last-renewed
                            (.minus (Instant/now) (Duration/of 1 ChronoUnit/HOURS))}
                           (Duration/of 1 (ChronoUnit/NANOS)))))
  (testing "That a checkout that was made within the expiration timeframe
            is not expired"
    (is (not (expired-checkout? {:last-renewed
                                 (.minus (Instant/now) (Duration/of 1 ChronoUnit/HOURS))}
                                (Duration/of 1 (ChronoUnit/HALF_DAYS)))))))

;; ----------------------------------------------------------------------------
(deftest site-available?-tests
  (testing "That a defined site with credentials is available"
    (let [site-state {:active-checkouts ()
                      :available-credentials {:GOOGLE (list {:login "123"})}}]
      (is (site-available? site-state :GOOGLE))))
  (testing "That a defined state with no credentials remaining for the site
            is not available"
    (let [site-state {:active-checkouts ()
                      :available-credentials {:GOOGLE ()}}]
      (is (not (site-available? site-state :GOOGLE)))))
  (testing "That a site not in the available creds map isn't available"
    (let [site-state {:active-checkouts ()
                      :available-credentials {}}]
      (is (not (site-available? site-state :GOOGLE))))))