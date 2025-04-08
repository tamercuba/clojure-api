(ns clojure-api.handlers.core
  (:require [clojure.data.json :as json]))

(defn name-handler "name-handler" [name]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (json/write-str {"body" (str "Hello World! My name is " name "!")})})
