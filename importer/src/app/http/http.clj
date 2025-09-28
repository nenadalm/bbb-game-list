(ns app.http.http
  (:require
   [clojure.string :as str]))

(defn ok-response? [response]
  (<= 200 (:status response) 299))

(defn- decompress [stream content-encoding]
  (case content-encoding
    "gzip" (java.util.zip.GZIPInputStream. stream)
    stream))

(defn- get-stream [http-response content-encoding]
  (decompress (.body http-response) content-encoding))

(defn- enrich-with-body [response http-response opts]
  (assoc
   response
   :body
   (let [content-encoding (get-in response [:headers "content-encoding"])]
     (case (:as opts)
       :stream (get-stream http-response content-encoding)
       (with-open [stream (get-stream http-response content-encoding)]
         (String. (.readAllBytes stream) java.nio.charset.StandardCharsets/UTF_8))))))

(defn request
  "opts
    required:
      :url - string

    optional:
      :method -  GET | POST | HEAD | OPTIONS | PUT | DELETE
      :headers - header map
      :body - string
      :as - :stream
      :throw-on-error - boolean"
  [opts]
  (let [client (-> (java.net.http.HttpClient/newBuilder)
                   (.build))
        request (-> (java.net.http.HttpRequest/newBuilder)
                    (.uri (java.net.URI/create (:url opts)))
                    (.headers (into-array
                               (into [] cat {"Content-Type" "wth" "Accept" "json"})))
                    (.method (:method opts "GET") (if-let [body (:body opts)]
                                                    (java.net.http.HttpRequest$BodyPublishers/ofString body)
                                                    (java.net.http.HttpRequest$BodyPublishers/noBody)))

                    (.build))
        http-response (.send client request (java.net.http.HttpResponse$BodyHandlers/ofInputStream))
        response (-> {:status (.statusCode http-response)
                      :headers (into {}
                                     (keep (fn [[k v]]
                                             (when k
                                               [(str/lower-case k) (str/join "," v)])))
                                     (.map (.headers http-response)))}
                     (enrich-with-body http-response opts))]
    (when (and (:throw-on-error opts)
               (not (ok-response? response)))
      (throw (ex-info "Request failed" {:response response})))
    response))
