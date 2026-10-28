(ns app.http.middleware
  (:require
   [clojure.string :as str]
   [app.http.http :as http]))

(defn- get-proxies []
  (into
   #{}
   (keep (fn [uri-s]
           (let [uri (java.net.URI. uri-s)]
             (case (.getScheme uri)
               ("http" "https") (java.net.Proxy.
                                 java.net.Proxy$Type/HTTP
                                 (java.net.InetSocketAddress. (.getHost uri) (.getPort uri)))
               nil))))
   (-> (http/request
        {:url "https://api.proxyscrape.com/v4/free-proxy-list/get?request=display_proxies&proxy_format=protocolipport&format=text&country=de"
         :throw-on-error true})
       :body
       (str/split-lines))))

(defn wrap-proxy [request]
  (let [available-proxies (atom nil)]
    (fn [opts]
      (locking available-proxies
        (when-not @available-proxies
          (reset! available-proxies (get-proxies))))
      (let [last-error (atom nil)]
        (loop [proxies @available-proxies]
          (if-let [proxy (first proxies)]
            (let [result (try
                           (request (assoc opts :proxy proxy))
                           (catch java.lang.Throwable e
                             (binding [*out* *err*]
                               (println "Error with proxy (removing)" proxy))
                             (swap! available-proxies disj proxy)
                             (reset! last-error e)
                             :err))]
              (if (= ::err result)
                (recur (rest proxies))
                result))
            (throw (ex-info "No more available proxies found." {:last-error @last-error}))))))))
