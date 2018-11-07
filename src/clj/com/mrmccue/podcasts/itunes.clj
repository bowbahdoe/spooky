(ns com.mrmccue.podcasts.itunes
  (:require [clojure.core.strint :refer [<<]]
            [cheshire.core :as cheshire]
            [clj-http.client :as client])
  (:import [java.net URLEncoder]
           [java.util List]
           [java.util.stream Collectors]))

(defn- as-json [{:keys [body]}]
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
        query-str (-> ^List stringified-pairs
                      (.stream)
                      (.collect (Collectors/joining "&")))]
     query-str))

(defn search-podcasts [query]
  (let [search-query (make-query-str {:media "podcast"
                                      :term query})
        url (<< "https://itunes.apple.com/search?~{search-query}")]
    (-> (client/get url) as-json)))

(defn- largest-key-by-prefix
  "For non-namespaced keys in the format {prefix}{int}
  like artworkUrl500, finds the largest of those keys
  in the given map by the value of the trailing number

  Ex. (largest-key-by-prefix {} \"a\") => nil
      (largest-key-by-prefix {:a1 0} \"a\") => :a1
      (largest-key-by-prefix {:a1 0 :a2 0 :a300 0 :b 0} \"a\") => :a300"
  [m prefix]
  (let [prefixed-keys (->> (keys m)
                           (map name)
                           (filter (fn [property]
                                     (.startsWith property
                                                  prefix))))
        key-sizes (->> (for [k prefixed-keys]
                         (.substring k
                                     (count prefix)))
                       (map #(Long/valueOf ^String % 10)))]
    (if (empty? key-sizes)
      nil
      (keyword (str prefix (apply max key-sizes))))))

(defn- largest-artwork-url
  "Given the search results from itunes, returns the
  artwork url that is for the thumbnail of the largest
  resolution available."
  [search-results]
  (get search-results
       (largest-key-by-prefix search-results "artworkUrl")))

(defn normalize-itunes-response [itunes-response]
  (for [result (:results itunes-response)]
    {:artist         (:artistName result)
     :collection     (:collectionName result)
     :collection_url (:collectionViewUrl result)
     :track          (:trackName result)
     :feedUrl        (:feedUrl result)
     :image          (largest-artwork-url result)
     :release        (:releaseDate result)
     :track_count    (:trackCount result)
     :explicit       (= (:collectionExplicitness result) "explicit")
     :genres         (:genres result)
     :images         (:images result)}))

(def normalized-search (comp normalize-itunes-response search-podcasts))