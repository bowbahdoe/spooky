(ns com.mrmccue.macros
  (:require [clojure.core.strint :refer [<<]]
            [clj-return-from.core :refer [block]]))

(defmacro oops [msg]
  (when (not (string? msg))
    (oops "Argument to 'oops' must be a string literal"))
  `(throw (IllegalArgumentException. ^String (<< ~msg))))

(defmacro m
  "Expands out a series of variables to a map where
  the name of the variable is the key under which the variable
  goes

  Ex. (m a b c) => {:a a, :b b, :c c}
      (m) => {}"
  [& vars]
  (doseq [name vars]
    (when (not (symbol? name))
      (oops "Every element passed to the 'm' macro must be a symbol.
Element ~{name} is not a symbol")))

  (into {}
        (for [name vars]
          [(keyword name) name])))

(declare
  ^{:doc "Dummy variable to resolve the | symbol in cursive"}
  |)

(defmacro m+
  "Like m, but will allow for custom rebinding of some symbols
  Ex. (m+ a b c) => {:a a, :b b, :c c}
      (m+) => {}
      (m+ a b | :cat c) => {:a a, :b b, :cat c}
      (m+ a b | c d :f some-var) => {:a a, :b b, c d, :f some-var}"
  [& vars]
  (let [number-of-dividers (count (filter #(= % '|) vars))]
    (when (not (or (= number-of-dividers 0)
                   (= number-of-dividers 1)))
      (oops "There should only be either 1 or 0 of the divider symbol '|
 passed to the 'm+' macro. Found ~{number-of-dividers} occurrences")))

  (let [[symbols map-bindings-plus-divider] (split-with #(not= % '|) vars)
        map-bindings (rest map-bindings-plus-divider)]
    (doseq [name symbols]
      (when (not (symbol? name))
        (oops "Every element passed to the 'm+' macro before
a divider must be a symbol.
Element ~{name} is not a symbol")))

    (when (not (even? (count map-bindings)))
      (oops "Uneven number of map bindings passed to the 'm+' macro"))

    `(merge (m ~@symbols)
            (hash-map ~@map-bindings))))

(declare return)
(defmacro imperative
  "lets you write the given block of code with unnamed early returns
  in the form of a `return` function."
  [& code]
  (let [block-name (gensym)
        ret-name (symbol (str "return-from-" block-name))]
    `(block ~block-name
            (let [~'return (fn [a#] (~ret-name a#))]
              ~@code))))

(declare const)
(declare var)