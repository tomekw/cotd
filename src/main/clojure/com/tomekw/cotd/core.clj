(ns com.tomekw.cotd.core
  (:gen-class))

(set! *warn-on-reflection* true)

(defn- print-doc [[k v]]
  (println (str k ":"))
  (println v))

(def docstrings
  (seq
   (let [publics (ns-publics 'clojure.core)]
     (zipmap
      (keys publics)
      (map (comp :doc meta)
           (vals publics))))))

(defn nth-var [n]
  (nth docstrings n))

(defn -main
  "Clojure of the day"
  [& [n]]
  (let [n (Integer. ^String n)
        rv (nth-var n)]
    (print-doc rv)))
