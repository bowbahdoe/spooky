(ns com.mrmccue.generate-value
  (:require [clojure.core.strint :refer [<<]])
  (:import [java.util List]
           [java.util.stream Collectors]
           [org.apache.commons.text WordUtils]))

(defn join-by
  "Joins the given list of strings by the given delimeter
  [\"apple\", \"bannana\"], \"&\" => \"apple&bannana\"
  [], & => \"\"
  [\"a\", \"b\", \"c\"], \"eee\" => \"aeeebeeeceee\""
  [strs delim]
  (-> ^List strs
      (.stream)
      (.collect (Collectors/joining delim))))

(defn join
  "concats the given list of strings"
  [strs]
  (join-by strs ""))

(defn- prefix-field-name
  "Prefixes the field maintaining camelcase. Assumes
  no spaces
  x, get => getX"
  [fieldname prefix]
  (str prefix (WordUtils/capitalize fieldname)))

(defn primitive? [type]
  (let [primitives #{"byte"
                     "short"
                     "int"
                     "long"
                     "char"
                     "float"
                     "double"
                     "boolean"}]
    (contains? primitives type)))

(defn nullable-field? [field]
  (boolean (:nullable field)))

(defn make-null-checks [fields]
  (let [primitive-field? (fn [{:keys [type]}]
                           (primitive? type))
        need-null-checks (->> fields
                             (filter (complement primitive-field?))
                             (filter nullable-field?))
        checks (for [{:keys [name]} need-null-checks]
                 (<<
                   "if (~{name} == null) {
                     throw IllegalArgumentException(\"~{name} is null\");
                   }"))]
    (join-by checks "\n")))

(defn- make-private-constructor [classname fields]
  (let [constructor-args (join-by
                           (for [{:keys [type name]} fields]
                             (<< "~{type} ~{name}"))
                           ", ")
        constructor-assignments (join (for [{:keys [name]} fields]
                                        (<< "this.~{name} = ~{name};\n")))
        null-checks (make-null-checks fields)
        constructor (<<
                      "private ~{classname} (~{constructor-args}) {
                        ~{null-checks}
                        ~{constructor-assignments}
                      }")]
    constructor))

(defn- make-getter [field]
  (let [{:keys [type name]} field
        getter-name (prefix-field-name name "get")]
    (<<
      "public ~{type} ~{getter-name}() {
        return this.~{name};
      }")))

(defn- make-getters [fields]
  (join-by (map make-getter fields) "\n"))

(defn- make-wither [classname changing-field original-field-list]
  (let [new-obj-args (join-by (for [field original-field-list]
                                (if (= changing-field field)
                                  (:name changing-field)
                                  (<< "this.~{(:name field)}")))
                              ",\n")
        {:keys [type name]} changing-field
        wither-method-name (prefix-field-name name "with")]
    (<<
      "public ~{classname} ~{wither-method-name}
        (~{type} ~{name}) {
          return new ~{classname}(~{new-obj-args})
        }")))

(defn- make-withers [classname fields]
  (join-by (map #(make-wither classname % fields) fields)
           "\n"))

(defn field-decls [fields]
  (join (for [{:keys [type name]} fields]
          (<< "private ~{type} ~{name};\n"))))

(defn- make-builder [classname fields]
  (<<
    "public static class Builder {
      protected Builder() {
        ~(join-by
           (for [{:keys [name]} fields]
             (str \"this.\" name \" = null;\"))
           \"\n\")
      }
    }"))

(defn value-template [classname fields]
  (let [field-declarations (field-decls fields)
        constructor (make-private-constructor classname fields)
        getters (make-getters fields)
        withers (make-withers classname fields)]
    (<<
      "public class ~{classname} {
        ~{field-declarations}
        ~{constructor}
        ~{getters}
        ~{withers}
      }")))
