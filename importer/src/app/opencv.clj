(ns app.opencv
  (:import
   [org.opencv.core Core Mat MatOfKeyPoint MatOfPoint2f MatOfByte]
   [org.opencv.calib3d Calib3d]
   [org.opencv.imgcodecs Imgcodecs]
   [org.opencv.imgproc Imgproc]
   [org.opencv.features2d ORB DescriptorMatcher]
   [org.opencv.highgui HighGui]
   [java.util ArrayList]))

(clojure.lang.RT/loadLibrary Core/NATIVE_LIBRARY_NAME)

(def ^:private orb (ORB/create))

(defn- create-image [url]
  (Imgcodecs/imdecode
   (MatOfByte.
    (with-open [in (.openStream (java.net.URL. url))]
      (.readAllBytes in)))
   Imgcodecs/IMREAD_COLOR))

(defn- grayscale [src]
  (let [gray (Mat.)]
    (Imgproc/cvtColor src gray Imgproc/COLOR_BGR2GRAY)
    gray))

(defn- extract-orb-features [gray-mat]
  (let [keypoints (MatOfKeyPoint.)
        descriptors (Mat.)]
    (.detectAndCompute orb gray-mat (Mat.) keypoints descriptors)
    {:keypoints keypoints
     :descriptors descriptors}))

(defn- match [features1 features2]
  (let [knn-matches (ArrayList.)
        {descriptors1 :descriptors} features1
        {descriptors2 :descriptors} features2]
    (when-not (or (.empty descriptors1) (.empty descriptors2))
      (let [matcher (DescriptorMatcher/create DescriptorMatcher/BRUTEFORCE_HAMMING)]
        (.knnMatch matcher descriptors1 descriptors2 knn-matches 2)))
    knn-matches))

(defn- good-matches [matches]
  (into
   []
   (keep (fn [matches]
           (let [[a b] (.toArray matches)]
             (when (and (< (.distance a) 50)
                        (< (.distance a) (* 0.75 (.distance b))))
               a))))
   matches))

(defn- homography-inliers [features1 features2]
  (let [knn-matches (match
                     features1
                      features2)
        matches (good-matches knn-matches)
        query-keypoints-list (.toList (:keypoints features1))
        ref-keypoints-list (.toList (:keypoints features2))
        query-pts (ArrayList.)
        ref-pts (ArrayList.)
        _ (doseq [m matches]
            (.add query-pts (.pt (.get query-keypoints-list (.queryIdx m))))
            (.add ref-pts (.pt (.get ref-keypoints-list (.trainIdx m)))))]
    (if (and (seq matches)
             (<= 4 (.size query-pts))
             (<= 4 (.size ref-pts)))
      (let [src-mat (MatOfPoint2f.)
            dst-mat (MatOfPoint2f.)
            mask (Mat.)
            _ (.fromList src-mat query-pts)
            _ (.fromList dst-mat ref-pts)]
        (Calib3d/findHomography src-mat dst-mat Calib3d/RANSAC 3.0 mask)
        (Core/countNonZero mask))
      0)))

(defn url->image [url]
  (when url
    (-> url
        create-image
        grayscale
        extract-orb-features)))

(defn same? [image1 image2]
  (when (and image1 image2)
    (< 10 (homography-inliers image1 image2))))

(defn- show-image [mat]
  (HighGui/imshow "image" mat)
  (HighGui/waitKey)
  (HighGui/destroyAllWindows))

(comment
  ;; bgg-path
  (def bgg-path "https://cf.geekdo-images.com/9lQIIxg_l6G-ZWmTqEHlOA__small/img/uiCYTRqVF3TMqfpFGM-O0az_Q4A=/fit-in/200x150/filters:strip_icc()/pic1949286.jpg")
  ;; bgg2-path
  (def bgg2-path "https://cf.geekdo-images.com/YieNLWVLKMERmrEosQsKOA__small/img/Vd8kb9AT204KNdE5GXBBK7JQL7g=/fit-in/200x150/filters:strip_icc()/pic248213.jpg")
  ;; grail-path
  (def grail-path "https://cdn.prod.website-files.com/678ffbad66e09233c867d400/67d888059578f5b6202139bf_IMG_6760_HEIC.avif")

  (same?
   (url->image grail-path)
   (url->image bgg-path))
  (same?
   (url->image grail-path)
   (url->image bgg2-path))
;;
  )
