(ns clojure-api.core
  #_{:clj-kondo/ignore [:refer-all]}
  (:require [compojure.core :refer :all]
            [clojure-api.handlers.core :as handlers]
            [ring.middleware.defaults :refer :all]
            [org.httpkit.server :as server]))

(defroutes app-routes
  (GET "/name/:name" [name] (handlers/name-handler name)))

(defn -main "API Server"
  [& args]
  (let [port (Integer/parseInt (or (System/getenv "PORT") "8080"))]
    (server/run-server #'app-routes {:port port})
    (println (str "Running the server at http://localhost:" port "/"))))
