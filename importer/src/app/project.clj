(ns app.project
  (:require
   [app.util :as u]
   [app.http.url :as http])
  (:import
   [org.jsoup Jsoup]))

(defn- parse-html*
  ([url]
   (parse-html* nil url))
  ([cookie url]
   (let [response (http/request
                   {:url url
                    :headers (cond-> {}
                               cookie (assoc "Cookie" cookie))
                    :as :stream})]
     (with-open [xin (:body response)]
       (Jsoup/parse xin "utf-8" url)))))

(def ^{:arglists (:arglists (meta #'parse-html*))} parse-html
  (u/retry 3 0 parse-html*))

(defn get-cookie* [url]
  (let [response (http/request
                  {:url url})]
    (get-in [:headers "set-cookie"] response)))

(def ^{:arglists (:arglists (meta #'get-cookie*))} get-cookie
  (u/retry 3 0 get-cookie*))
