(ns com.tomekw.cotd.core
  (:gen-class))

(defn -main [& args]
  (let [public-functions (vals (ns-publics 'clojure.core))
        random-doc (meta (rand-nth public-functions))]
    (do (println "-------------------------")
        (println (str "clojure.core/" (:name random-doc)))
        (println (:arglists random-doc))
        (println (str "  " (:doc random-doc))))))

