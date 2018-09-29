(ns com.mrmccue.graphql-ring
  (:require [clojure.core.strint :refer [<<]]
            [clojure.tools.logging :as log]
            [clojure.string]
            [ring.middleware.params]
            [cheshire.core :as cheshire]
            [hiccup.core :as hiccup]
            [com.walmartlabs.lacinia :as lacinia]))

(def ^{:private true}
  default-graphiql-version "0.11.11")

(defn- graphiql-page-hiccup [& {:keys [graphiql_html_title
                                       graphiql_version
                                       result
                                       variables
                                       operation_name
                                       query]
                                :or   {graphiql_html_title "GraphiQl"
                                       graphiql_version default-graphiql-version}}]
  [:html
   [:head
    [:title graphiql_html_title]
    [:style "
           html, body {
             height: 100%;
             margin: 0;
             overflow: hidden;
             width: 100%;
           }"]

    [:meta {:name "referrer" :content "no-referrer"}]
    [:link {:href (<< "//cdn.jsdelivr.net/npm/graphiql@~{graphiql_version}/graphiql.css")
            :rel "stylesheet"}]
    [:script {:src "//cdn.jsdelivr.net/fetch/0.9.0/fetch.min.js"}]
    [:script {:src "//cdn.jsdelivr.net/react/15.0.0/react.min.js"}]
    [:script {:src "//cdn.jsdelivr.net/react/15.0.0/react-dom.min.js"}]
    [:script {:src (<< "//cdn.jsdelivr.net/npm/graphiql@~{graphiql_version}/graphiql.min.js")}]]
   [:body
    [:script
     (<< "// Collect the URL parameters
           var parameters = {};
           window.location.search.substr(1).split('&').forEach(function (entry) {
             var eq = entry.indexOf('=');
             if (eq >= 0) {
               parameters[decodeURIComponent(entry.slice(0, eq))] =
                 decodeURIComponent(entry.slice(eq + 1));
             }
           });
           // Produce a Location query string from a parameter object.
           function locationQuery(params) {
             return '?' + Object.keys(params).map(function (key) {
               return encodeURIComponent(key) + '=' +
                 encodeURIComponent(params[key]);
             }).join('&');
           }
           // Derive a fetch URL from the current URL, sans the GraphQL parameters.
           var graphqlParamNames = {
             query: true,
             variables: true,
             operationName: true
           };
           var otherParams = {};
           for (var k in parameters) {
             if (parameters.hasOwnProperty(k) && graphqlParamNames[k] !== true) {
               otherParams[k] = parameters[k];
             }
           }
           var fetchURL = locationQuery(otherParams);
           // Defines a GraphQL fetcher using the fetch API.
           function graphQLFetcher(graphQLParams) {
             return fetch(fetchURL, {
               method: 'post',
               headers: {
                 'Accept': 'application/json',
                 'Content-Type': 'application/json'
               },
               body: JSON.stringify(graphQLParams),
               credentials: 'include',
             }).then(function (response) {
               return response.text();
             }).then(function (responseBody) {
               try {
                 return JSON.parse(responseBody);
               } catch (error) {
                 return responseBody;
               }
             });
           }
           // When the query and variables string is edited, update the URL bar so
           // that it can be easily shared.
           function onEditQuery(newQuery) {
             parameters.query = newQuery;
             updateURL();
           }
           function onEditVariables(newVariables) {
             parameters.variables = newVariables;
             updateURL();
           }
           function onEditOperationName(newOperationName) {
             parameters.operationName = newOperationName;
             updateURL();
           }
           function updateURL() {
             history.replaceState(null, null, locationQuery(parameters));
           }
           // Render <GraphiQL /> into the body.
           ReactDOM.render(
             React.createElement(GraphiQL, {
               fetcher: graphQLFetcher,
               onEditQuery: onEditQuery,
               onEditVariables: onEditVariables,
               onEditOperationName: onEditOperationName,
               query: ~(cheshire/encode query),
               response: ~(cheshire/encode result),
               variables: ~(cheshire/encode variables),
               operationName: ~(cheshire/encode operation_name),
             }),
             document.body
           );")]]])


(defn- html-resp
  "Makes a simple html response."
  [status data]
  {:status status
   :headers {"content-type" "text/html"}
   :body data})

(defn- render-graphiql [req]
  (html-resp 200
             (hiccup/html (graphiql-page-hiccup :result nil
                                                :variables nil
                                                :operation_name nil
                                                :query nil))))

(defn- extract-gql-args
  "Given a request, will extract the operationName,
  the query, and any variables passed alongside the query."
  [req]
  (case (:request-method req)
    :get {:query (get (:params req) "query")
          :operation-name (get (:params req) "operationName")
          :variables (get (:params req) "variables")}
    :post (let [body-json (cheshire/decode
                            (slurp (:body req))
                            keyword)]
            {:query (:query body-json)
             :operation-name (:operation_name body-json)
             :variables (:variables body-json)})))

(defn- json-resp
  "Makes a simple json response."
  [status data & {:keys [pretty]
                  :or {pretty false}}]
  {:status status
   :headers {"content-type" "application/json"}
   :body (cheshire/encode data {:pretty pretty})})


(defn- invalid-request-method?
  "Returns whether the request is sent with a request method that
  is invalid for a GQL request (a.k.a. anything other than :get
  or :post)"
  [req]
  (not (contains? #{:get :post} (:request-method req))))

(defn- request-wants-html?
  "Does the request want html more than json"
  [req]
  (let [accept (get (:headers req) "accept")]
    (clojure.string/includes? accept "text/html")))

(defn- execute-req [schema req]
  (let [{:keys [query
                variables
                operation-name]} (extract-gql-args req)]
    (lacinia/execute schema
                     query
                     variables
                     {})))

(defn graphql-view
  "Returns a function that can act as a ring route for fielding
  graphql requests."
  [& {:keys [schema graphiql pretty]
      :or {graphiql true
           pretty false}}]
  (letfn [(show-graphiql? [req]
            (and graphiql
                 (= (:request-method req) :get)
                 (or (not= (get (:params req) "raw") "true")
                     (request-wants-html? req))))
          (prettify-response? [req]
            (or pretty
                (show-graphiql? req)
                (= (get (:params req) "pretty") "true")))]

    (-> (fn [req]
          (let [req (-> req
                        (ring.middleware.params/params-request))]
            (cond (invalid-request-method? req)
                  (json-resp 405 (<< "Invalid request method ~(:request-method req)"))

                  (show-graphiql? req)
                  (render-graphiql req)

                  :else
                  (json-resp 200
                             (execute-req schema req)
                             :pretty (prettify-response? req))))))))