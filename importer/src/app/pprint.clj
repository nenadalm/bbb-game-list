(ns app.pprint
  (:require
   [clojure.pprint :as pp]))

(defn- pprint-clojure-list [alis]
  (pp/pprint-logical-block
   :prefix "(list " :suffix ")"
   (pp/print-length-loop
    [alis (seq alis)]
    (when alis
      (pp/write-out (first alis))
      (when (next alis)
        (.write ^java.io.Writer *out* " ")
        (pp/pprint-newline :linear)
        (recur (next alis)))))))

(defn- pprint-def [alis]
  (if (next alis)
    (let [[def-sym def-name & stuff] alis]
      (pp/pprint-logical-block :prefix "(" :suffix ")"
                               ((pp/formatter-out "~w ~1I~@_~w") def-sym def-name)
                               (when (seq stuff)
                                 ((pp/formatter-out " ~@_"))
                                 ((pp/formatter-out "~{~w~^ ~_~}") stuff))))
    (#'pp/pprint-simple-code-list alis)))

(defn- pprint-code-list [alis]
  (if (= 'def (first alis))
    (pprint-def alis)
    (pprint-clojure-list alis)))

(defn- use-method
  "Installs a function as a new method of multimethod associated with dispatch-value. "
  [^clojure.lang.MultiFn multifn dispatch-val func]
  (. multifn addMethod dispatch-val func))

(defmulti
  clojure-dispatch
  "The pretty print dispatch function for pretty printing Clojure code."
  class)

(use-method clojure-dispatch clojure.lang.ISeq pprint-code-list)
(use-method clojure-dispatch clojure.lang.IPersistentVector #'pp/pprint-vector)
(use-method clojure-dispatch clojure.lang.IPersistentMap #'pp/pprint-map)
(use-method clojure-dispatch clojure.lang.IPersistentSet #'pp/pprint-set)
(use-method clojure-dispatch clojure.lang.PersistentQueue #'pp/pprint-pqueue)
(use-method clojure-dispatch clojure.lang.Var #'pp/pprint-simple-default)
(use-method clojure-dispatch clojure.lang.IDeref #'pp/pprint-ideref)
(use-method clojure-dispatch nil pr)
(use-method clojure-dispatch :default #'pp/pprint-simple-default)
