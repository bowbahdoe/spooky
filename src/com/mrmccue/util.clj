(ns com.mrmccue.util)

;; https://stackoverflow.com/questions/3249334/test-whether-a-list-contains-a-specific-value-in-clojure
(defn in?
  "true if coll contains elm"
  [coll elm]
  (some #(= elm %) coll))

(defn hierarchy
  "credits to @seancorfield. I got it from him; who knows where he got it"
  [klass]
  (->> klass ancestors (map str) sort clojure.pprint/pprint))
