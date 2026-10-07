(ns app.project.bbb-palmovka
  (:require
   [app.project.bbb :as bbb]))

(defn games []
  (filterv
   (fn [game]
     (contains? (:locations game) "Palmovka"))
   (bbb/games)))
