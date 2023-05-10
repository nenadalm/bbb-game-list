(ns app.pprint
  (:require
   [clojure.pprint :as pp]))

(defn- pprint-clojure-list
  "Prints valid clojure as opposed to edn
  original: https://github.com/clojure/clojure/blob/05a8e8b323042fa043355b716facaed6003af324/src/clj/clojure/pprint/dispatch.clj#L453"
  [alis]
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

(defn- use-method
  "Installs a function as a new method of multimethod associated with dispatch-value. "
  [^clojure.lang.MultiFn multifn dispatch-val func]
  (. multifn addMethod dispatch-val func))

(defmulti
  clojure-dispatch
  "The pretty print dispatch function for pretty printing Clojure code."
  class)

(use-method clojure-dispatch clojure.lang.ISeq pprint-clojure-list)
(use-method clojure-dispatch clojure.lang.IPersistentVector #'pp/pprint-vector)
(use-method clojure-dispatch clojure.lang.IPersistentMap #'pp/pprint-map)
(use-method clojure-dispatch clojure.lang.IPersistentSet #'pp/pprint-set)
(use-method clojure-dispatch clojure.lang.PersistentQueue #'pp/pprint-pqueue)
(use-method clojure-dispatch clojure.lang.Var #'pp/pprint-simple-default)
(use-method clojure-dispatch clojure.lang.IDeref #'pp/pprint-ideref)
(use-method clojure-dispatch nil pr)
(use-method clojure-dispatch :default #'pp/pprint-simple-default)
