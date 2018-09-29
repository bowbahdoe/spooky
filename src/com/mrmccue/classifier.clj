(ns com.mrmccue.classifier
  (:import [org.deeplearning4j.nn.modelimport.keras KerasModelImport]
           [org.nd4j.linalg.io ClassPathResource]))

(defn load-seq-model-with-weights [resource-path]
  (let [model-path (-> (ClassPathResource. resource-path)
                       (.getFile)
                       (.getPath))]
    (KerasModelImport/importKerasSequentialModelAndWeights model-path)))