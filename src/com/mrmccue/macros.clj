(ns com.mrmccue.macros
  (:require [clojure.core.strint :refer [<<]]
            [clj-return-from.core :refer [block]]))

(defmacro oops [msg]
  (when (not (string? msg))
    (oops "Argument to 'oops' must be a string literal"))
  `(throw (IllegalArgumentException. ^String (<< ~msg))))

;; ----------------------------------------------------------------------------
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


;; ----------------------------------------------------------------------------
(declare
  ^{:doc "Dummy variable to resolve the | symbol in cursive"}
  |)

;; ----------------------------------------------------------------------------
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

;; ----------------------------------------------------------------------------
(def return
  #(throw (UnsupportedOperationException.
            "return function used outside of supporting macro context")))

;; ----------------------------------------------------------------------------
(defmacro allow-early-return
  "lets you write the given block of code with unnamed early returns
  in the form of a `return` function.

  Because the return mechanism uses Exceptions under the hood,
  catching the generic Exception or Throwable class will lead to undefined
  behaviour if done within a block that may call the return function.

  Ex. (allow-early-return
        (when (> x 10)
          (return false))
        (... some longer computation ...))"
  [& code]
  (let [block-name (gensym)
        ret-name (symbol (str "return-from-" block-name))]
    `(block ~block-name
            (let [~'return (fn [a#] (~ret-name a#))]
              ~@code))))

;; ----------------------------------------------------------------------------
(def const
  #(throw (UnsupportedOperationException.
            "const function used outside of supporting macro context")))

;; ----------------------------------------------------------------------------
(defmacro allow-toplevel-const
  "Lets you write constant variables without nesting let
  at the toplevel of the contained forms by using a 'const'
  special form. The last form evaluated is returned
  Ex. (allow-toplevel-const
        (const x 10)
        (const y 10)
        (println (+ x y))
        (const z (* x y))
        (println z)
        z)"
  [& code]
  (let [starts-with-const (fn [form] (and (list? form)
                                          (not (empty? form))
                                          (= (first form) 'const)))
        valid-const-form (fn [form] (and (starts-with-const form)
                                         (= (count form) 3)
                                         (symbol? (second form))))]
    (if (empty? code)
      code
      (let [form (first code)]
        (if (starts-with-const form)
          (if (valid-const-form form)
            `(let [~(nth form 1) ~(nth form 2)]
               (allow-toplevel-const ~@(rest code)))
            (oops "Const form is invalid ~{form}"))
          (if (= (count (rest code)) 0)
             (first code)
             `(do ~(first code)
                  (allow-toplevel-const ~@(rest code)))))))))

;; ----------------------------------------------------------------------------
(defmacro imperative [& code]
  `(allow-early-return
     (allow-toplevel-const
         ~@code)))

;; ----------------------------------------------------------------------------
(defmacro pull-keys
  "Given an object and a vector of keywords which have the names of getter methods
  on that object, will produce a map with the values from those getters as the
  values and the name of the getter keyword-ized as the key.
  Optionally, this can take a function to be applied to every value that is taken
  from the object. This is useful for things like extracting values out of Options

  This macro is useful for turning objects that don't follow the bean naming scheme
  into persistent maps.
  Ex.

  (pull-keys [] [:getClass]) => {:getClass clojure.lang.PersistentVector}
  (pull-keys [] [[:getClass [:getClass]]]) => {:getClass {:getClass java.lang.class}}
  "
  [obj getters & [id-fn]]
  (letfn [(apply-to-each [expr]
            (let [fun (if (nil? id-fn) `identity id-fn)]
              (list fun expr)))
          (take-property [obj k]
            (apply-to-each (list (symbol (str "." (name k))) obj)))
          (single-property [obj key]
            (list `assoc key (take-property obj key)))
          (renamed-property [obj [key-name getter-name]]
            (list `assoc key-name (take-property obj getter-name)))
          (recursive-properties [obj [key-name nested-props]]
            (list `assoc key-name
                  (make-assocs (take-property obj key-name) nested-props)))
          (make-assocs [obj getters]
            `(-> {}
                 ~@(for [g getters]
                     (cond (keyword? g)
                           (single-property obj g)
                           (and (sequential? g) (= (count g) 2))
                           (if (sequential? (second g))
                             (recursive-properties obj g)
                             (renamed-property obj g))
                           :else
                           (throw
                             (IllegalArgumentException.
                               "Every element in the vector must be a keyword or a pair of a keyword
                                and either another keyword or a nested vector of the same structure."))))))]
    (make-assocs obj getters)))