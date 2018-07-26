(ns
  ^{:author "Ethan McCue"
    :email "emccue@live.com"
    :doc "A service implementation for logging into google."}
  com.mrmccue.login.services.google
  (:import [org.openqa.selenium.chrome ChromeDriver]
           [org.openqa.selenium WebElement Keys By WebDriver$Options
                                WebDriver$Navigation WebDriver$Navigation]
           [org.openqa.selenium.support.ui WebDriverWait ExpectedConditions])
  (:require [com.mrmccue.login.services.core :refer [Service login logout required-str]]
            [com.mrmccue.login.services.selenium :refer [*make-selenium-driver*]]
            [com.mrmccue.login.config :refer [*config*]]
            [clojure.java.data :refer [from-java]]))

(def ^{:private true} +login-button-xpath+ "//*[contains(text(), 'Sign in')]")
(def ^{:private true} +email-form-xpath+ "//input[@type='email']")
(def ^{:private true} +password-form-xpath+ "//input[@type='password']")

(defn- find-form-by-xpath [driver xpath]
  (let [wait (WebDriverWait. driver 10)]
    (. wait until (ExpectedConditions/visibilityOfElementLocated (By/xpath xpath)))))

(defn- login-to-google
  "Uses selenium to get the cookies associated with a google session."
  [driver {:keys [email password]}]
  (let [_ (.get driver "https://google.com")
        login-button (.findElementByXPath driver +login-button-xpath+)
        _ (.click login-button)
        email-form (find-form-by-xpath driver +email-form-xpath+)
        _ (.sendKeys email-form (into-array [email (str Keys/RETURN)]))
        password-form (find-form-by-xpath driver +password-form-xpath+)
        _ (.sendKeys password-form (into-array [password (str Keys/RETURN)]))
        cookies (-> driver (.manage) (.getCookies))]
    cookies))

(defn- logout-from-google
  [driver {:keys [cookies]}]
  (let [_ (.get driver "https://google.com")
        _ (println cookies)
        _ (println (-> driver (.manage) (.getCookies)))
        _ (-> driver (.manage) (.deleteAllCookies))
        _ (doseq [cookie cookies]
            (-> driver (.manage) (.addCookie cookie)))
        _ (-> driver (.navigate) (.refresh))
        _ (println "AAAAAA")]))


(def service
  (reify Service
    (login [_ {:keys [email password] :as auth}]
      (required-str email)
      (required-str password)
      (with-open [driver (*make-selenium-driver*)]
        (login-to-google driver auth)))

    (logout [_ {:keys [cookies]}]
      (let [driver (*make-selenium-driver*)]
        (.get driver "https://google.com")
        (doseq [cookie cookies]
          (-> driver (.manage) (.addCookie cookie)))
        (.get driver "https://google.com")))))

(defn- -main []
  (let [cookies (login service {:email (get *config* "google.email")
                                :password (get *config* "google.password")})]
    (println (into [] cookies))
    (logout service {:cookies cookies})))
