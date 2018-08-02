(ns com.mrmccue.util
  (:import [java.security MessageDigest]
           [java.nio.charset StandardCharsets]))

;; https://stackoverflow.com/questions/3249334/test-whether-a-list-contains-a-specific-value-in-clojure
(defn in?
  "true if coll contains elm"
  [coll elm]
  (some #(= elm %) coll))

(defn hierarchy
  "credits to @seancorfield. I got it from him; who knows where he got it"
  [klass]
  (->> klass ancestors (map str) sort clojure.pprint/pprint))


(defn unroll
  "Unrolls a map where each key is a set of keys
  into a map where each key in that set is assigned
  to the value that the original set was.

  If the sets share items, that is U.B.

  ex. (unroll {#{1 2 3} 'a
               #{4} 'b})
      => {1 'a
          2 'a
          3 'a
          4 'b}"
  [m]
  (into {}
        (mapcat identity
                (for [[key-set val] m]
                  (for [key key-set]
                    [key val])))))


(defn sha-512
  [str]
  (let [bytes (-> (MessageDigest/getInstance "SHA-512")
                  (.digest (.getBytes str StandardCharsets/UTF_8)))
        hex-str (format "%x" (BigInteger. bytes))]
    hex-str))
