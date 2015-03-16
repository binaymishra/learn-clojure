(ns webapp.app
  (:require 
    [ring.adapter.jetty :as jetty]
    clojure.pprint))

(defn app
  [request]
  {:status 200
   :body (with-out-str
           (clojure.pprint/pprint request))})