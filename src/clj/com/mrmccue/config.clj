(ns
  ^{:author "Ethan McCue"}
  com.mrmccue.config
  (:require [clojure.java.io :as io]
            [cheshire.core :as cheshire])
  (:import [java.util Properties]
           [org.apache.commons.io.input CharSequenceReader]
           [clojure.lang IPersistentMap]
           [com.github.shyiko.dotenv DotEnv]))

(defn load-properties [filename]
  (doto (Properties.)
    (.load (-> (io/resource filename)
               (slurp)
               (CharSequenceReader.)))))

(defn load-json [filename]
  (cheshire/decode
    (-> (io/resource filename)
        (slurp))))

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
    (config-val [_ value]
      (get (DotEnv/load) value))))

(defn- merge-two-configs
  "Merges the two configs, preferring values left to right"
  [config-1 config-2]
  (reify Config
    (config-val [_ value]
      (let [config-1-value (config-val config-1 value)]
        (if (nil? config-1-value)
          (config-val config-2 value)
          config-1-value)))))

(defn merge-configs
  "Merges a sequence of configs, preferring values left to right"
  [configs]
  (let [empty-config (reify Config
                       (config-val [_ _] nil))]
    (reduce merge-two-configs
            empty-config
            configs)))

(def ^:dynamic *config*
  (merge-configs
    [(load-json "config.json")
     (load-properties "config.properties")
     -dot-env]))