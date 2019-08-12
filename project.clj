(defproject cotd "0.0.1-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :source-paths ["src/main/clojure"]
  :profiles {:uberjar {:global-vars {*assert* false}
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"
                                  "-Dclojure.spec.skip-macros=true"]
                       :main com.tomekw.cotd.core
                       :aot :all}})
