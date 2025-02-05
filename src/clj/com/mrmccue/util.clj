(ns com.mrmccue.util
  ^{:author "Ethan McCue"
    :email "emccue@live.com"
    :doc "Helpful utility functions."}
  (:require [com.mrmccue.macros :refer [oops]]
            [clojure.reflect]
            [clojure.pprint :refer [print-table]])
  (:import [java.security MessageDigest SecureRandom]
           [java.nio.charset StandardCharsets]))

;; https://stackoverflow.com/questions/3249334/test-whether-a-list-contains-a-specific-value-in-clojure
(defn in?
  "true if coll contains elm"
  [coll elm]
  (some #(= elm %) coll))

(defn make-private!
  "Given a var in a namespace, alters that vars
  metadata so it is private. Useful for hiding default
  record constructors

  (defrecord Apple [color])
  (make-private! #'map->Apple)
  (make-private! #'->Apple)"
  [var]
  (alter-meta! var assoc :private true))

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
  "Gets the SHA-512 of a UTF-8 String. Returns a byte array"
  [str]
  (let [bytes (-> (MessageDigest/getInstance "SHA-512")
                  (.digest (.getBytes str StandardCharsets/UTF_8)))
        hex-str (format "%x" (BigInteger. bytes))]
    hex-str))

(defn get-salt-sha1prng
  "Gets a random byte array to use as a salt in a cryptographic hash"
  ([salt-length]
   (.generateSeed (SecureRandom/getInstance "SHA1PRNG") salt-length))
  ([]
   (get-salt-sha1prng 32)))

(defn filtermap
  "Maps the function over the list and removes any nils
  from the resulting list."
  [f list]
  (filter (complement nil?) (map f list)))

(defn enumerate
  "Given a sequence, returns a sequence of pairs of
  each item of the sequence with its index.

  ((0 item-1) (1 item-2) (2 item-3) ...)"
  [seq]
  (map vector (range) seq))

(defn count-from
  "Provides a downto and upto similar to the ruby methods
  of the same name on integers. Used for a more fluent
  inclusive range syntax.

  (count-from 0 :up-to 10) => (0 1 2 3 4 5 6 7 8 9 10)
  (count-from 10 :down-to 0) => (10 9 8 7 6 5 4 3 2 1 0)
  (count-from 0 :up-to 0) => (0)
  (count-from 0 :down-to 0) => (0)
  (count-from 0 :down-to 10) => (0)
  (count-from 10 :up-to 0) => (10)"
  [start sym stop]
  (let [if-empty-just-start (fn [l]
                              ;; The ruby version has behaviour
                              ;; where the first number in the
                              ;; range is always included.
                              ;; This mimics that by rejecting any
                              ;; empty sequence that might be produced
                              ;; by the built in range function.
                              (if (empty? l) (list start) l))
        allowed-counting-fns {:up-to (fn [start end]
                                       (if-empty-just-start
                                         (range start (inc end))))
                              :down-to (fn [start end]
                                         (if-empty-just-start
                                           (range start (dec end) -1)))}]
    (if (contains? allowed-counting-fns sym)
      ((get allowed-counting-fns sym) start stop)
      (oops "Invalid counting procedure. expected one of ~(keys allowed-counting-fns)"))))

(defn try-in-sequence
  "Tries the given list of procedures in order and
  if one throws an Exception, tries the next in series.

  If a procedure succeeds, that value is returned.

  If none of the procedures succeed, then the given
  default-value is returned."
  [expressions default-value]
  (if (empty? expressions)
    default-value
    (try
      ((first expressions))
      (catch Exception _#
        (try-in-sequence (rest expressions)
                         default-value)))))

(defn obj-methods [obj]
  (print-table
    (sort-by :name
               (filter :exception-types
                       (:members (clojure.reflect/reflect obj))))))