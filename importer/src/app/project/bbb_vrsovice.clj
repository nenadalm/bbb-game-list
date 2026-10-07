(ns app.project.bbb-vrsovice
  (:require
   [app.project.bbb :as bbb]))

(defn games []
  (filterv
   (fn [game]
     (contains? (:locations game) "Vršovice"))
   (bbb/games)))
