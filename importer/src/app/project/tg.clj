(ns app.project.tg
  (:require
   [app.bgg :as bgg]))

(defn games []
  (bgg/username->games "mirdata"))
