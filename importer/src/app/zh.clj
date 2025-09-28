(ns app.zh
  (:require
   [clojure.string :as str]
   [app.util :as u]
   [app.http.url :as http]
   [app.cache :as cache])
  (:import
   [org.jsoup Jsoup]))

(defn- parse-html*
  [url]
  (let [response (http/request
                  {:url url
                   :as :stream})]
    (with-open [xin (:body response)]
      (Jsoup/parse xin "utf-8" url))))

(def ^{:arglists (:arglists (meta #'parse-html*))} parse-html
  (u/retry 3 0 parse-html*))

(defn- cache-url [url content]
  (cache/store (u/sha1 (str url)) (.outerHTML content)))

(defn- load-url [url]
  (Jsoup/parse (cache/load (u/sha1 (str url)))))

(defn parse-cached-html [url]
  (if-let [data (load-url url)]
    (do
      (tap> (str "[GET - CACHED] " url))
      data)
    (do
      (tap> (str "[GET] " url))
      (let [data (parse-html url)]
        (cache-url url data)
        data))))

(defn game-name [game-url]
  (let [doc (parse-cached-html game-url)]
    (str/trim (.text (.select doc "h1")))))
