(ns com.mrmccue.podcasts.itunes
  (:require [clojure.core.strint :refer [<<]]
            [cheshire.core :as cheshire]
            [clj-http.client :as client])
  (:import [java.net URLEncoder]
           [java.util List]
           [java.util.function Function]
           [java.util.stream Collectors]))

(defn as-json [{:keys [body]}]
  (cheshire/decode body keyword))

(defn make-query-str
  "{} =>
   {:a 2} => a=2
   {:a 2 :b 3} => a=2&b=3"
  [pairs]
  (let [encode (fn [item] (URLEncoder/encode (if (keyword? item)
                                               (name item)
                                               (str item))
                                             "UTF-8"))
        stringified-pairs (for [[k v] pairs]
                            (str (encode k) "=" (encode v)))
        query-str (-> stringified-pairs
                      (.stream)
                      (.collect (Collectors/joining "&")))]
     query-str))

(defn search-podcasts [query]
  (let [search-query (make-query-str {:media "podcast"
                                      :term query})
        url (<< "https://itunes.apple.com/search?~{search-query}")]
    (-> (client/get url) as-json)))

(defn normalize-itunes-response [itunes-response]
  (for [result (:results itunes-response)]
    (let [_ result]
      {:artist (:artistName _)
       :collection (:collectionName _)
       :collection_url (:collectionViewUrl _)
       :track (:trackName _)
       :feedUrl (:feedUrl _)
       :image ""
       :release (:releaseDate _)
       :track_count (:trackCount _)
       :explicit (= (:collectionExplicitness _) "explicit")
       :genres (:genres _)
       :images (:images _)})))

(def normalized-search (comp normalize-itunes-response search-podcasts))