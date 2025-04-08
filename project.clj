(defproject clojure-api "0.1.0-SNAPSHOT"
  :description "Simples clojure API"
  :url "https://github.com/tamercuba/clojure-api"
  :license {:name "MIT License"
            :url ""}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring "1.8.2"]
                 [ring/ring-defaults "0.3.4"]
                 [ring/ring-core "1.8.2"]
                 [ring/ring-jetty-adapter "1.8.2"]
                 [compojure "1.6.1"]
                 [http-kit "2.3.0"]
                 [org.clojure/data.json "0.2.6"]]
  :plugins [[cider/cider-nrepl "0.42.1"] [lein-ring "0.12.5"]]
  :ring {:handler clojure-api.handlers.code/name-handler}
  :main ^:skip-aot clojure-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
