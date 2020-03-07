(ns app.url-cache
  (:refer-clojure :exclude [load])
  (:require
   [clojure.java.io]))

(def ^:private root (.getFile (clojure.java.io/resource ".cache/url")))

(defn- sha-1 [s]
  (let [c (java.security.MessageDigest/getInstance "sha-1")]
    (.update c (.getBytes s "utf-8"))
    (.encodeHex (at.favre.lib.bytes.Bytes/wrap (.digest c)))))

(defn- url->file [url]
  (clojure.java.io/as-file (str root "/" (sha-1 (str url)))))

(defn load [url]
  (let [f (url->file (str url))]
    (when (.exists f)
      f)))

(defn store [url content]
  (with-open [xout (clojure.java.io/output-stream (url->file url))]
    (.transferTo content xout)))
