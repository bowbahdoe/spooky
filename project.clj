(defproject spooky "0.1.0"
  :description "Generic Remote Login Service"
  :repositories [["Icosillion Repository" "https://maven.icosillion.com/artifactory/open-source/"]
                 ["WSO2" "http://maven.wso2.org/nexus/content/repositories/public/"]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ch.qos.logback/logback-classic "1.2.3"]
                 [org.clojure/core.async "0.4.474"]
                 [org.apache.commons/commons-lang3 "3.7"]
                 [commons-io/commons-io "2.6"]
                 [compojure/compojure "1.6.1"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [org.clojure/core.match "0.2.2"]
                 [org.clojure/algo.generic "0.1.2"]
                 [org.clojure/tools.logging "0.4.1"]
                 [org.clojure/core.incubator "0.1.4"]
                 [org.clojure/data.json "0.2.6"]
                 [ring/ring-devel "1.6.3"]
                 [ring/ring-json "0.4.0"]
                 [clj-http "3.9.1"]
                 ;; https://mvnrepository.com/artifact/org.clojure/java.jdbc
                 [org.clojure/java.jdbc "0.7.7"]
                 ;; https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc
                 [org.xerial/sqlite-jdbc "3.23.1"]
                 ;; https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
                 [org.seleniumhq.selenium/selenium-java "3.13.0"]
                 ;; https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver
                 [org.seleniumhq.selenium/selenium-chrome-driver "3.13.0"]
                 ;; https://mvnrepository.com/artifact/org.seleniumhq.selenium/htmlunit-driver
                 [org.seleniumhq.selenium/htmlunit-driver "2.31.0"]
                 ;; https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
                 [io.github.bonigarcia/webdrivermanager "2.2.4"]
                 [org.clojure/java.data "0.1.1"]
                 ;; https://mvnrepository.com/artifact/org.immutables/value
                 [org.immutables/value "2.6.3"]
                 [com.github.shyiko.dotenv/dotenv "0.1.1"]
                 ;; https://mvnrepository.com/artifact/clj-return-from/clj-return-from
                 [clj-return-from/clj-return-from "1.0.1"]
                 [com.icosillion.podengine/podengine "2.2"]
                 [com.walmartlabs/lacinia "0.29.0-rc-1"]
                 [com.novemberain/monger "3.1.0"]
                 [selmer "1.12.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [io.pedestal/pedestal.service       "0.5.4"]
                 [io.pedestal/pedestal.service-tools "0.5.4"] ;; Only needed for ns-watching; WAR tooling
                 [io.pedestal/pedestal.jetty         "0.5.4"]
                 ;; -- Deep Learning Deps START
                 ;; https://mvnrepository.com/artifact/org.deeplearning4j/deeplearning4j-core
                 [org.deeplearning4j/deeplearning4j-core "1.0.0-beta2"]
                 ;; https://mvnrepository.com/artifact/org.deeplearning4j/deeplearning4j-modelimport
                 [org.deeplearning4j/deeplearning4j-modelimport "1.0.0-beta2"]
                 ;; https://mvnrepository.com/artifact/org.nd4j/nd4j-native-platform
                 [org.nd4j/nd4j-native-platform "1.0.0-beta2"]
                 ;; https://mvnrepository.com/artifact/org.datavec/datavec-api
                 [org.datavec/datavec-api "1.0.0-beta2"]
                 ;; -- END
                 [org.apache.poi/poi-ooxml "3.17"]
                 [org.apache.poi/poi "3.17"]
                 ;; https://mvnrepository.com/artifact/org.apache.axis2.wso2/axis2
                 [org.apache.axis2.wso2/axis2 "1.6.2.wso2v13"]
                 ;; https://mvnrepository.com/artifact/org.apache.axis2.wso2/axis2-client
                 [org.apache.axis2.wso2/axis2-client "1.6.2.wso2v13"]
                 ;; https://mvnrepository.com/artifact/org.apache.axis2/axis2-java2wsdl
                 [org.apache.axis2/axis2-java2wsdl "1.7.8"]]


  :ring {:handler com.mrmccue.podcasts.core/app}
  :plugins [[lein-ring "0.12.1"]
            [lein-codox "0.10.4"]]

  :java-source-paths ["src/"]
  :main ^:skip-aot com.mrmccue.podcasts.core
  :target-path "target/%s"
  :resource-paths ["resources/"]
  :profiles {:uberjar {:aot :all}})