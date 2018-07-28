(ns com.mrmccue.login.services.selenium
  (:import [org.openqa.selenium.chrome ChromeDriver ChromeOptions]
           [io.github.bonigarcia.wdm WebDriverManager]))

;; Make sure chrome driver is installed
(.setup (WebDriverManager/chromedriver))

;; Any Service that needs to use selenium for its implementation
;; should use this to create its driver to the browser.
(def ^:dynamic *make-selenium-driver*
  (fn [] (ChromeDriver. (doto (ChromeOptions.)
                          (.setHeadless true)))))