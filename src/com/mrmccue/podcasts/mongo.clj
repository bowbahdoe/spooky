(ns com.mrmccue.podcasts.mongo
  (:use [com.mrmccue.macros])
  (:require [monger.core :as mg]
            [monger.collection :as mc]
            [com.stuartsierra.component :as component]))

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

(defn register-user [{:keys [db]} &
                     {:keys [username password]}]
  (mc/insert-and-return db
                        "users"
                        (m username password)))

(defn list-all-users [{:keys [db]}]
  (mc/find-maps db "users"))
