(defproject spooky "0.1.0"
  :description "Generic Remote Login Service"
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
                 [ring/ring-devel "1.6.3"]
                 [ring/ring-json "0.4.0"]
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
                 [org.immutables/value "2.6.3"]]
  :ring {:handler com.mrmccue.login.core/app}
  :plugins [[lein-ring "0.12.1"]]

  :java-source-paths ["src/"]
  :main ^:skip-aot com.mrmccue.login.core
  :target-path "target/%s"
  :resource-paths ["resources/"]
  :profiles {:uberjar {:aot :all}})