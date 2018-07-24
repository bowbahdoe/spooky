(ns
  ^{:author "Ethan McCue"}
  com.mrmccue.login.config
  (:require [clojure.java.io :as io])
  (:import [java.util Properties]
           [org.apache.commons.io.input CharSequenceReader]))

(defn load-config []
  (doto (Properties.)
    (.load (-> (io/resource "config.properties")
               (slurp)
               (CharSequenceReader.)))))

(def ^:dynamic *config* (load-config))