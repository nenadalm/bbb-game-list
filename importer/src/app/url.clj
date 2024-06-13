(ns app.url
  (:require
   [clojure.java.io]
   [app.url-cache :as url-cache]
   [app.util :as u]))

(defn- ->uncached-stream* [url]
  (clojure.java.io/input-stream url))

(def ^:private uncached-url-stream
  "boardgamegeek.com returns `429 Too Many Requests` in case we are too quick, sometimes it fails with eof error."
  (->> ->uncached-stream*
       (u/retry 3 5000)
       (u/blocking-debounce 2000)))

(defn ->cached-stream [url]
  (if-let [x (url-cache/load url)]
    (do
      (tap> (str "[GET - CACHED] " url))
      (clojure.java.io/input-stream x))
    (do
      (tap> (str "[GET] " url))
      (with-open [xin (uncached-url-stream url)]
        (url-cache/store url xin)
        (clojure.java.io/input-stream (url-cache/load url))))))
