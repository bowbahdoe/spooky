(ns
  ^{:author "Ethan McCue"
    :email "emccue@live.com"
    :doc "A service implementation for logging into google."}
  com.mrmccue.login.services.google
  (:import [io.github.bonigarcia.wdm WebDriverManager]
           [org.openqa.selenium.chrome ChromeDriver]
           [org.openqa.selenium WebElement Keys By WebDriver$Options Cookie]
           [org.openqa.selenium.support.ui WebDriverWait ExpectedConditions])
  (:require [com.mrmccue.login.services.core :refer [Service login required-str]]
            [com.mrmccue.login.config :refer [*config*]]))

;; Make sure chrome driver is installed
(.setup (WebDriverManager/chromedriver))

(def +login-button-xpath+ "//*[contains(text(), 'Sign in')]")
(def +email-form-xpath+ "//input[@type='email']")
(def +password-form-xpath+ "//input[@type='password']")

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
    (map bean cookies)))

(def service
  (reify Service
    (login [_ {:keys [email password]}]
      (required-str email)
      (required-str password)
      (with-open [driver (ChromeDriver.)]
        (login-to-google driver {:email email :password password})))

    (logout [_ session-info]
      (throw (UnsupportedOperationException. "Not Yet Implemented")))))

(defn- -main []
  (let [cookies (login service {:email (get *config* "google.email")
                                :password (get *config* "google.password")})]
    (println cookies)))
