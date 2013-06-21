(defproject slice "0.7.1-SNAPSHOT"
  :description "Write composable slices of HTML, CSS and JS in Clojure"
  :url "http://github.com/scottjad/slice"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [hiccup "1.0.3"]
                 [gaka "0.3.0"]
                 [scriptjure "0.1.24"]
                 [uteal "0.2.1-SNAPSHOT"]
                 [ring "1.2.0-RC1"]
                 [compojure "1.1.5" :exclusions [ring/ring-core lib-noir ring-server]]])
