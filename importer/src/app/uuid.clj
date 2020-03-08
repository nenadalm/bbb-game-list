(ns app.uuid
  (:import
   [com.fasterxml.uuid Generators]))

(defn generate []
  (.generate (Generators/timeBasedGenerator)))
