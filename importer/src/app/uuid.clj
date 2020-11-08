(ns app.uuid
  (:import
   [com.fasterxml.uuid Generators]))

(defn generate []
  (.generate (Generators/timeBasedGenerator)))

(defn from-string [s]
  (java.util.UUID/nameUUIDFromBytes (.getBytes s)))
