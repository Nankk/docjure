(defproject org.clojars.nankk/docjure "1.14.1-SNAPSHOT"
  :description "Easily read and write Office documents from Clojure."
  :url "https://github.com/Nankk/docjure"
  :license {:name "MIT License"
            :url "http://http://en.wikipedia.org/wiki/MIT_License"}
  :repositories {"clojars" {:url "https://clojars.org/repo" :sign-releases false}}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.apache.poi/poi "4.1.0"]
                 [org.apache.poi/poi-ooxml "4.1.0"]]
  :plugins [[lein-difftest "2.0.0"]]
  :profiles {:1.5  {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6  {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7  {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8  {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.9  {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.10 {:dependencies [[org.clojure/clojure "1.10.0"]]}
             :test {:global-vars  {*warn-on-reflection* false}
                    :resource-paths ["test/dk/ative/docjure/testdata"]}}
  :aliases {"all" ["with-profile" "1.5:1.6:1.7:1.8:1.9:1.10"]}
  :global-vars {*warn-on-reflection* true})

