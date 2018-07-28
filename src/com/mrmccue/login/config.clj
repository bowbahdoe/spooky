(ns
  ^{:author "Ethan McCue"}
  com.mrmccue.login.config
  (:require [clojure.java.io :as io])
  (:import [java.util Properties]
           [org.apache.commons.io.input CharSequenceReader]
           [clojure.lang IPersistentMap]
           [com.github.shyiko.dotenv DotEnv]))

(defn load-properties [filename]
  (doto (Properties.)
    (.load (-> (io/resource filename)
               (slurp)
               (CharSequenceReader.)))))

(defprotocol Config
  (config-val [this value]
    "Gets the value from the config.
    Should return nil for missing values"))

(extend-protocol Config
  ;; Simple String -> String config
  Properties
  (config-val [this value]
    (get this value))
  ;; General Clojure Map
  IPersistentMap
  (config-val [this value]
    (get this value)))

(def ^{:private true} -dot-env
  (reify Config
    (config-val [this value]
      (get (DotEnv/load) value))))

(defn merge-configs
  "Merges the two configs, preferring values left to right"
  [config-1 config-2]
  (reify Config
    (config-val [_ value]
      (let [config-1-value (config-val config-1 value)]
        (if (nil? config-1-value)
          (config-val config-2 value)
          config-1-value)))))

(def ^:dynamic *config*
  (merge-configs (load-properties "config.properties") -dot-env))