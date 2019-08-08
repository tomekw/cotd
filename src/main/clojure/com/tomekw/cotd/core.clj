(ns com.tomekw.cotd.core
  (:gen-class)
  (:use [clojure.repl :only (doc)]))

(defn- lookup-doc-for [function-name]
  (eval `(doc ~function-name)))

(def for-namespace
  (symbol "clojure.core"))

(def functions-list
  (keys (ns-publics for-namespace)))

(def random-function-name
  (rand-nth functions-list))

(defn -main
  "Clojure of the day"
  [& args]
  (lookup-doc-for random-function-name))
