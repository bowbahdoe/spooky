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
            [io.pedestal.http :as http])
  (:gen-class :main true))

(defroutes main-routes
           (GET "/session_info" [] (fn [req] (str (:session req))))
           (GET "/google_credentials" []
             (fn [req] {:body (login google/service {:email (config-val *config* "google.email")
                                                     :password (config-val *config* "google.password")})}))
           (POST "/graphql" []
             (fn [req]
               (println)
               (println "HHHHHHHH")
               (println)
               (let [graphql-req (cheshire/decode (body-string req))]
                 (response (gql/q (get graphql-req "query")
                                  (get graphql-req "variables"))))))

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

(defn respond-hello [req]
  {:status 200
   :body "Hello World"})

(def routes
  #{["/hello" :get respond-hello :route-name ::hello]})

(defn start []
  (-> {::http/routes routes
       ::http/port 8899
       ::http/type :jetty}
      (http/create-server)
      (http/start)))

(defn -main
  "This is the main entry point for the application."
  [& args]
  (start))
  ;; (println *command-line-args*)
  ;; (let [port (or (first *command-line-args*) 8080)]
  ;;   (jetty/run-jetty app {:port port})])