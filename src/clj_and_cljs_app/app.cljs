(ns clj-and-cljs-app.app)

(defn ^:dev/after-load refresh []
  (println "Reloading app"))

(defn init []
  (refresh))
