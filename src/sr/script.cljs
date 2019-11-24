(ns sr.script)

(defn main [& cli-args]
  (println "hello world" cli-args)
  (js/process.exit 0))
