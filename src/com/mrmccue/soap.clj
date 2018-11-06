(ns com.mrmccue.soap
  (:import [net.autotask.atws.v1_5 ATWS ATWSSoap ATWSZoneInfo])
  (:require [clojure.java.data :refer [from-java to-java]]))

;; Best "Hello World" I could do without auth. The
;; rest of the endpoints throw 401 unauthorized.
;;
;; Also, this is a demo of how you could maybe work with the
;; codegenned JS code. (A.K.A convert to<->from JS classes)
;;
;; The available on library on NPM hasn't been updated in a long
;; time, but it is also explicitly marked "No Maintenance Intended"
;; so maybe the autotask api changes so infrequently its fine to
;; just use and sidestep the whole codegen BS.
;; https://github.com/BrandonBoone/Autotask.js
;;
;; It is also really simple code so its also possible to not
;; give a shit and just maintain your own private copy.
;;
;; The other option is to just use Visual Basic. I'm not sure
;; I can reccomend C# because the WSDL they provide doesnt have
;; types declared for some fields
;; (though I know C# has support for dynamic typing
;;  https://docs.microsoft.com/en-us/dotnet/csharp/programming-guide/types/using-type-dynamic)

(def soap-client (.getATWSSoap (ATWS.)))

;; Not gonna give sensible data because username is junk
(def zone-info (.getZoneInfo soap-client "test"))

;; [ -1, -1, "" ]
(println [(.getCI zone-info)
          (.getErrorCode zone-info)
          (.getURL zone-info)])


;; NOTE: probably not important because it is probably a bad
;; call to use clojure for your business,
;; but the from-java and to-java functions are multimethods
;; so they can be customized for particular classes and work
;; recursively on bean-like things by default.

;; Convert bean to map
(def zone-info-map (from-java zone-info))

;; {:CI -1, :URL "", :dataBaseType "", :errorCode -1, :webUrl ""}
(println zone-info-map)

;; Convert map to bean
(def zone-info-remade (to-java ATWSZoneInfo zone-info-map))

;; [ -1, -1, "" ]
(println [(.getCI zone-info-remade)
          (.getErrorCode zone-info-remade)
          (.getURL zone-info-remade)])

;; Useful for building queries or just working without getters
;; and setters
(def altered-zone-info-map (assoc zone-info-map :URL "something.com"))

(def altered-zone-info-remade (to-java ATWSZoneInfo altered-zone-info-map))

;; [-1 -1 something.com]
(println [(.getCI altered-zone-info-remade)
          (.getErrorCode altered-zone-info-remade)
          (.getURL altered-zone-info-remade)])