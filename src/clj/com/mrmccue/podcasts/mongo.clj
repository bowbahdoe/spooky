(ns com.mrmccue.podcasts.mongo
  (:use [com.mrmccue.macros])
  (:require [com.mrmccue.util :refer [count-from make-private!]]
            [monger.core :as mg]
            [monger.collection :as mc]
            [mount.core :as mount :refer [defstate]]
            [com.mrmccue.config :refer [config config-val]]
            [clojure.tools.logging :as log])
  (:import [org.springframework.security.crypto.bcrypt BCryptPasswordEncoder]))

(defstate mongo-conn
          :start (mg/connect)
          :stop (mg/disconnect mongo-conn))

(defstate db
          :start (mg/get-db mongo-conn "podcasts"))

(def password-encoder (BCryptPasswordEncoder.))

(defn register-user [username password]
  (when (nil? username)
    (oops "Must provide a non-null username"))
  (when (nil? password)
    (oops "Must provide a non-null password"))

  (let [password-hash (.encode password-encoder password)]
    (log/info (str "Registering user " username))
    (mc/insert-and-return db
                          "users"
                          (m username
                             password-hash))))

(defn check-password [username password]
  (when (nil? username)
    (oops "Must provide a non-null username"))
  (when (nil? password)
    (oops "Must provide a non-null password"))

  (let [user-record (mc/find-one-as-map
                      db
                      "users"
                      {:username username})
        valid-pass (and (not (nil? user-record))
                        (.matches
                          password-encoder
                          password
                          (:password-hash user-record)))
        _ (if valid-pass
            (log/info (str "Given correct password for " username))
            (log/info (str "Given wrong password for " username)))]
    valid-pass))

(defn list-all-users []
  (mc/find-maps db "users"))