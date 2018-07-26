(ns com.mrmccue.login.sites
  (:require [com.mrmccue.login.services.google :as google]))

(def service-impls
  {:GOOGLE google/service})