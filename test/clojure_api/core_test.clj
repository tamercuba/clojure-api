(ns clojure-api.core-test
  (:require [clojure.test :refer :all]
            [clojure-api.handlers.core :refer :all]
            [clojure.data.json :as json]))

(deftest test-name-handler-successfully
  (testing "Test name-handler successfully"
    (is (= (:status (name-handler "tamer")) 200))))
