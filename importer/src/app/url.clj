(ns app.url
  (:require
   [clojure.java.io]
   [app.url-cache :as url-cache]
   [app.util :as u]))

(defn- ->uncached-stream* [url]
  (clojure.java.io/input-stream url))

(def ^:private uncached-url-stream
  "boardgamegeek.com returns 429 Too Many Requests in case we are too quick."
  (u/blocking-debounce 3000 ->uncached-stream*))

(defn ->cached-stream [url]
  (if-let [x (url-cache/load url)]
    (do
      (tap> (str "[GET - CACHED] " url))
      (clojure.java.io/input-stream x))
    (with-open [xin (uncached-url-stream url)]
      (url-cache/store url xin)
      (tap> (str "[GET] " url))
      (clojure.java.io/input-stream (url-cache/load url)))))
