(ns com.mrmccue.podcasts.gql
  (:require [clojure.java.io :as io]
            [clojure.edn :as edn]
            [com.walmartlabs.lacinia.util :as util]
            [com.walmartlabs.lacinia.schema :as schema]
            [com.walmartlabs.lacinia :as lacinia]
            [com.mrmccue.podcasts.itunes :as itunes]
            [com.mrmccue.podcasts.feed :as feed]))

(defn resolver-map
  []
  {:query/search (fn [_ {:keys [query]} _]
                   (itunes/normalized-search query))
   :query/feed (fn [_  {:keys [url]} _]
                 (feed/safe (feed/podcast-feed url)))
   :SearchResult/feed (fn [_ _ {:keys [feedUrl]}]
                       (feed/safe (feed/podcast-feed feedUrl)))})

(defn load-schema []
  (-> (io/resource "podcasts/schema.edn")
      (slurp)
      (edn/read-string)
      (util/attach-resolvers (resolver-map))
      (schema/compile)))


(def schema (load-schema))

(defn q
  ([query-string variables options]
   (lacinia/execute schema query-string variables options))
  ([query-string variables]
   (q query-string variables nil))
  ([query-string]
   (q query-string nil)))