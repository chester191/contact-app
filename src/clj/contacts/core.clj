(ns clj.contacts.core
  (:require [org.httpkit.server :refer [run-server]]
            [reitit.ring :as ring]))

(defn -main[]
  (println "hello world"))
(def app
  (ring/ring-handler
   (ring/router
    [["/api" {:get (fn [req]
                     {:status 200
                      :body "ok"})}]])))