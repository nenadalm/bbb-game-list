(ns app.http.url
  (:require
   [clojure.string :as str]))

(defn request
  "opts
    required:
      :url - string

    optional:
      :method -  GET | POST | HEAD | OPTIONS | PUT | DELETE
      :headers - header map
      :as - :stream"
  [opts]
  (let [url (let [u (:url opts)] (if (string? u) (java.net.URL. u) u))
        conn (.openConnection url)]
    (.setRequestMethod conn (:method opts "GET"))
    (doseq [[k v] (:headers opts)]
      (.setRequestProperty conn k v))

    (.connect conn)

    (let [status (.getResponseCode conn)]
      {:status status
       :body (case (:as opts)
               :stream (.getInputStream conn)
               (with-open [stream (.getInputStream conn)]
                 (String. (.readAllBytes stream) java.nio.charset.StandardCharsets/UTF_8)))
       :headers (into {}
                      (keep (fn [[k v]]
                              (when k
                                [(str/lower-case k) (str/join "," v)])))
                      (.getHeaderFields conn))})))
