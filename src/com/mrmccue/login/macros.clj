(ns com.mrmccue.login.macros
  (:require [clojure.core.strint :refer [<<]]))

(defmacro m
  "Expands out a series of variables to a map where
  the name of the variable is the key under which the variable
  goes

  Ex. (m a b c) => {:a a, :b b, :c c}
      (m) => {}"
  [& vars]
  (doseq [name vars]
    (when (not (symbol? name))
      (throw (IllegalArgumentException.
               ^String
               (<< "Every element passed to the 'm' macro must be a symbol.
Element ~{name} is not a symbol")))))

  (into {}
        (for [name vars]
          [(keyword name) name])))