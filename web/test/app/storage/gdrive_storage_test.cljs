(ns app.storage.gdrive-storage-test
  (:require
   [clojure.test :refer [deftest is async]]
   [app.storage.local-storage :refer [SetLocalStorage]]
   [app.storage.protocols :as proto]
   [app.storage.gdrive-storage :as gdrive]))

(deftype AFile [a]
  proto/IFile
  (-read-file [_]
    (js/Promise.resolve @a))
  (-write-file [_ data]
    (reset! a data)
    (js/Promise.resolve)))

(deftype AEdnStorage [a]
  proto/IEdnStorage
  (-read [_]
    @a)
  (-store [_ x]
    (reset! a x)))

(defn create-set [achanges asnapshot adrive]
  (gdrive/SetGdriveStorage.
   (AEdnStorage. achanges)
   (SetLocalStorage. (AEdnStorage. asnapshot))
   (AFile. adrive)))

(defn- test-data [atoms]
  (let [{:keys [changes snapshot drive]} atoms]
    {:changes @changes
     :snapshot @snapshot
     :snapshot-meta (meta @snapshot)
     :drive @drive
     :drive-meta (meta @drive)}))

(deftest set-gdrive-storage-test
  (async
   done
   (let [achanges (atom nil)
         asnapshot (atom nil)
         adrive (atom nil)
         atoms {:changes achanges :snapshot asnapshot :drive adrive}
         set-storage (create-set achanges asnapshot adrive)]

     ;; test initial state
     (is (= #{} (proto/get-all set-storage)))

     ;; test adding new keys
     (is (= #{:key1} (proto/add-item set-storage :key1)))
     (is (= #{:key1 :key2} (proto/add-item set-storage :key2)))

     ;; test removing non existent key
     (is (= #{:key1 :key2} (proto/remove-item set-storage :key3)))

     (is (= {:changes {:key1 true :key2 true :key3 false}
             :snapshot nil
             :snapshot-meta nil
             :drive nil
             :drive-meta nil}
            (test-data atoms)))

     (-> (proto/sync set-storage)
         (.then
          (fn []
            (is (= {:changes {}
                    :snapshot #{:key1 :key2}
                    :snapshot-meta {:items {:key1 {:version 1}
                                            :key2 {:version 1}}}
                    :drive #{:key1 :key2}
                    :drive-meta {:items {:key1 {:version 1}
                                         :key2 {:version 1}}}}
                   (test-data atoms)))

            ;; test key removal
            (is (= #{:key1} (proto/remove-item set-storage :key2)))

            (is (= {:changes {:key2 false}
                    :snapshot #{:key1 :key2}
                    :snapshot-meta {:items {:key1 {:version 1}
                                            :key2 {:version 1}}}
                    :drive #{:key1 :key2}
                    :drive-meta {:items {:key1 {:version 1}
                                         :key2 {:version 1}}}}
                   (test-data atoms)))

            (proto/sync set-storage)))
         (.then
          (fn []
            (is (= {:changes {}
                    :snapshot #{:key1}
                    :snapshot-meta {:items {:key1 {:version 1}
                                            :key2 {:version 2}}}
                    :drive #{:key1}
                    :drive-meta {:items {:key1 {:version 1}
                                         :key2 {:version 2}}}}
                   (test-data atoms)))

            ;; test changing keys to the same value (should have no effect on versions)
            (is (= #{:key1} (proto/add-item set-storage :key1)))
            (is (= #{:key1 :key2} (proto/add-item set-storage :key2)))
            (is (= #{:key1} (proto/remove-item set-storage :key2)))

            (proto/sync set-storage)))
         (.then
          (fn []
            (is (= {:changes {}
                    :snapshot #{:key1}
                    :snapshot-meta {:items {:key1 {:version 1}
                                            :key2 {:version 2}}}
                    :drive #{:key1}
                    :drive-meta {:items {:key1 {:version 1}
                                         :key2 {:version 2}}}}
                   (test-data atoms)))))
         (.then
          (fn []
            (done)))))))

(deftest set-gdrive-storage2
  (let [achanges (atom nil)
        asnapshot (atom nil)
        adrive (atom nil)
        set-storage (create-set achanges asnapshot adrive)]
    ;; test initial state
    (is (= #{} (proto/get-all set-storage)))

     ;; test adding new keys
    (is (= #{:key1 :key2} (proto/add-all set-storage [:key1 :key2])))))
