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
            [com.mrmccue.login.services.google :as google]
            [com.mrmccue.login.services.core :refer [login]]
            [com.mrmccue.config :refer [*config* config-val]]
            [com.mrmccue.podcasts.gql :as gql]
            [com.mrmccue.graphql-ring :refer [graphql-view]]
            [io.pedestal.http :as http])
  (:gen-class :main true))

(def gql-routes (graphql-view :schema gql/schema
                              :graphiql true))
(defroutes main-routes
           (GET "/session_info" [] (fn [req] (str (:session req))))
           (GET "/google_credentials" []
             (fn [req] {:body (login google/service {:email (config-val *config* "google.email")
                                                     :password (config-val *config* "google.password")})}))
           (POST "/graphql" [] gql-routes)
           (GET "/graphql" [] gql-routes)
           (route/resources "/")
           (route/not-found "<h1> Not Found </h1>"))

(defn wrap-dir-index
  "Middleware to force request for / to return index.html"
  [handler]
  (fn [req]
    (handler
      (update-in req [:uri]
                 #(if (= "/" %) "/index.html" %)))))

(def app (-> main-routes
             (wrap-dir-index)
             (json-middleware/wrap-json-response)
             (handler/site)))

(defn -main
  "This is the main entry point for the application."
  [& args]
  (println *command-line-args*)
  (let [port (or (first *command-line-args*) 8080)]
     (jetty/run-jetty app {:port port})))