(ns com.mrmccue.podcasts.mongo
  (:use [com.mrmccue.macros])
  (:require [com.mrmccue.util :refer [count-from]]
            [monger.core :as mg]
            [monger.collection :as mc]
            [com.stuartsierra.component :as component]
            [clojure.tools.logging :as log]))

;; Database Component ripe for instrumentation
(defrecord MongoDB [table-name conn db]
  component/Lifecycle
  (start [this]
    (let [conn (mg/connect)]
      (-> this
          (assoc :conn conn)
          (assoc :db (mg/get-db conn (:table-name this))))))
  (stop [this]
    (mg/disconnect (:conn this))
    (-> this
        (assoc :conn nil)
        (assoc :db nil))))

(defn make-mongodb
  "Makes an instance of the mongo db component"
  []
  (map->MongoDB {:table-name "podcasts"}))

(defn- concat-byte-arrays [arr1 arr2]
  (let [arr1-len (count arr1)
        arr2-len (count arr2)
        comb-len (+ arr1-len arr2-len)
        new-arr (byte-array comb-len)]
    (doseq [i (count-from 0 :up-to arr1-len)]
      (aset-byte new-arr i (aget arr1 i)))
    (doseq [i (count-from arr1-len :up-to (dec comb-len))]
      (log/info (- i arr1-len))
      (aset-byte new-arr i (aget arr1 (- i arr1-len))))
    new-arr))

(defn- registration-info [new-user]
  (let [{:keys [username password]} new-user
        password-salt (com.mrmccue.util/get-salt-sha1prng)
        password-hash (com.mrmccue.util/sha-512 (str password
                                                     password-salt))]
    (log/info (str password password-salt))
    (m username
       password-salt
       password-hash)))



(defn register-user [{:keys [db]} &
                     {:keys [username password]}]
  (let [salt (com.mrmccue.util/get-salt-sha1prng)
        password-hash (com.mrmccue.util/sha-512 (str password salt))]
    (mc/insert-and-return db
                          "users"
                          (m+ username
                              password-hash
                              | :password-salt salt))))

(defn list-all-users [{:keys [db]}]
  (mc/find-maps db "users"))
