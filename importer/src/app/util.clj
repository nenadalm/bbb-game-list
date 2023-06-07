(ns app.util)

(defn blocking-debounce
  "Returns function with same arguments as `f` that can be called at most once every `ms` ms. In case function would be called more times, current thread is blocked up to `ms` ms."
  [ms f]
  (let [prev-end (atom (java.time.Instant/EPOCH))]
    (fn [& args]
      (let [start (java.time.Instant/now)
            pause-ms (.toMillis (java.time.Duration/between @prev-end start))]
        (Thread/sleep (max 0 (- ms pause-ms)))
        (let [res (apply f args)]
          (reset! prev-end (java.time.Instant/now))
          res)))))

(defn retry [n f]
  (fn [& args]
    (loop [attempt 1]
      (let [result (try
                     (apply f args)
                     (catch Throwable t
                       (if (<= n attempt)
                         (throw t)
                         (do
                           (println "Retrying after following error:")
                           (.printStackTrace t)
                           ::retry))))]
        (if (= ::retry result)
          (recur (inc attempt))
          result)))))
