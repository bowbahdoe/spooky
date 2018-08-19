(ns com.mrmccue.podcasts.feed
  (:require [clj-http.client :as client])
  (:import [com.icosillion.podengine.models Podcast ITunesOwner
                                            Episode ITunesChannelInfo]))

(defmacro safe [& body]
  `(try (do ~@body)
        (catch Exception e#
          nil)))

(defn podcast-feed [url]
  (let [xml (:body (client/get url))
        podcast (Podcast. ^String xml)]
    {:title       (safe (.getTitle podcast))
     :description (let [desc (safe (.getDescription podcast))]
                    {:short desc
                     :long  desc})
     :link        (safe (.getLink podcast))
     :image       (safe (some-> (.getImageURL podcast)
                                (.toString)))
     :language    (safe (.getLanguage podcast))
     :copyright   (safe (.getCopyright podcast))
     :updated     (safe (some-> (.getLastBuildDate podcast)
                                (.toGMTString)))
     :explicit    nil
     :categories  (safe (some-> (.getCategories podcast)
                                (vec)))
     :author      (safe (.getManagingEditor podcast))
     :owner       (safe (some-> ^ITunesChannelInfo (.getITunesInfo podcast)
                                (.getOwner)
                                (as-> owner
                                      {:name  (.getName owner)
                                       :email (.getEmail owner)})))
     :episodes    (safe (for [^Episode episode (.getEpisodes podcast)]
                          {:guid        (safe (.getGUID episode))
                           :title       (safe (.getTitle episode))
                           :description (safe (.getDescription episode))
                           :explicit    nil ;; TODO episode explicitness
                           :image       (.toString (.getImageURL podcast))
                           :published   (.toGMTString (.getPubDate episode))
                           :duration    (safe (some-> episode
                                                      (.getITunesInfo)
                                                      (.getDuration)))
                           :categories  (safe (some-> episode
                                                      (.getCategories)
                                                      (vec)))
                           :url         (safe (.getLink episode))}))}))

(defn retry-times [n f]
  (if (= n 0)
    (f)
    (try (f)
         (catch Exception e (retry-times (dec n) f)))))