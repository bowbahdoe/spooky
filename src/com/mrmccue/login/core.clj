(ns
  ^{:author "Ethan McCue"}
  com.mrmccue.login.core
  (:require [compojure.core :refer [defroutes GET context]]
            [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as jetty]
            [ring.middleware.json :as json-middleware]
            [com.mrmccue.login.services.google :as google]
            [com.mrmccue.login.services.core :refer [login]]
            [com.mrmccue.login.config :refer [*config* config-val]])
  (:gen-class :main true))

(defroutes main-routes
           (GET "/session_info" [] (fn [req] (str (:session req))))
           (GET "/google_credentials" []
             (fn [req] {:body (login google/service {:email (config-val *config* "google.email")
                                                     :password (config-val *config* "google.password")})}))

           (route/resources "/")
           (route/not-found "<h1> Not Found </h1"))

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