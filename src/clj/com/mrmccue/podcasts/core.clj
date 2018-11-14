(ns
  ^{:author "Ethan McCue"}
  com.mrmccue.podcasts.core
  (:require [compojure.core :refer [defroutes GET POST context]]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.util.response :refer [response]]
            [ring.util.request :refer [body-string]]
            [ring.adapter.jetty :as jetty]
            [ring.middleware.json :as json-middleware]
            [cheshire.core :as cheshire]
            [mount.core :as mount]
            [com.mrmccue.config :refer [config config-val]]
            [com.mrmccue.podcasts.gql :as gql]
            [com.mrmccue.graphql-ring :refer [graphql-view]]
            [ring.middleware.cors :refer [wrap-cors]])
  (:gen-class :main true))

(def gql-routes (graphql-view :schema gql/schema
                              :graphiql true))

(defn catch-all-resources []
  (let [resources-route (route/resources "/")]
    (fn [req]
      (or (resources-route req)
          (resources-route (assoc-in req [:uri] "/index.html"))))))

(defroutes main-routes
           (POST "/graphql" [] gql-routes)
           (GET "/graphql" [] gql-routes)
           (catch-all-resources))


(defn wrap-dir-index
  "Middleware to force request for / to return index.html"
  [handler]
  (fn [req]
    (handler
      (update-in req [:uri]
                 #(if (= "/" %) "/index.html" %)))))

(def app (-> main-routes
             (wrap-cors :access-control-allow-origin [#".+"]
                        :access-control-allow-methods [:get :put :post :delete])
             (wrap-dir-index)
             (json-middleware/wrap-json-response)
             (handler/site)))

(defn -main
  "This is the main entry point for the application."
  [& args]
  (mount/start)
  (let [port (Integer/valueOf ^String (config-val config "port"))]
     (jetty/run-jetty app {:port port})))