(ns com.mrmccue.history
  (:require [clojure.algo.generic.functor :refer [fmap]]))

;; This record only exists to allow us to implement
;; protocols on History. It should not be used outside this ns.
(defrecord -History
  [current forward back])

(defn make-history
  "Creates a new history store starting at the given 'origin'"
  [start-with]
  (-History. start-with () ()))

(defn forward
  "Moves forward in the history. If there is nothing forward,
  there is no change."
  [history]
  (if (empty? (:forward history))
    history
    (-> history
        (assoc :back (cons (:current history) (:back history)))
        (assoc :forward (rest (:forward history)))
        (assoc :current (first (:forward history))))))

(defn back
  "Moves back in the history. If there is nothing back,
  there is no change."
  [history]
  (if (empty? (:back history))
    history
    (-> history
        (assoc :back (rest (:back history)))
        (assoc :forward (cons (:current history) (:forward history)))
        (assoc :current (first (:back history))))))

(defn current
  "Gets the current point in the history"
  [history]
  (:current history))

(defn to
  "Navigates to the given point. Erases everything forward."
  [history next]
  (-> history
      (assoc :back (cons (:current history) (:back history)))
      (assoc :forward ())
      (assoc :current next)))

;; Maps the given function over the history.
;; Turns a history of a into a history of b.
(defmethod fmap -History
  [f history]
  (-> history
      (assoc :back (fmap f (:back history)))
      (assoc :forward (fmap f (:forward history)))
      (assoc :current (f current))))