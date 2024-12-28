(ns app.cache
  (:refer-clojure :exclude [load])
  (:require
   [clojure.java.io :as io]))

(def ^:private root (.getFile (io/resource ".cache/url")))

(defn- id->file [id]
  (io/as-file (str root "/" id)))

(defn load [id]
  (let [f (id->file id)]
    (when (.exists f)
      (slurp f))))

(defn store [id content]
  (let [file (id->file id)]
    (try
      (spit file content)
      (catch Throwable t
        (.delete file)
        (throw t)))))
