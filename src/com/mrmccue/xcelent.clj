(ns com.mrmccue.xcelent
  (:require [clojure.core.async :refer [chan <!! >!]])
  (:import [javax.swing JFileChooser JFrame JButton]
           [java.awt Dimension]))

(defn file-picker
  "Makes a file picker and returns the path of the selected
  file or nil if the user cancelled picking"
  [parent-component]
  (let [file-chooser (JFileChooser.)
        return-flag (.showOpenDialog file-chooser parent-component)]
    (if (= return-flag JFileChooser/APPROVE_OPTION)
      (.getSelectedFile file-chooser)
      nil)))


(defn save-location-picker
  "Makes a file picker and returns the path of the selected
  file or nil if the user cancelled picking"
  [parent-component]
  (let [file-chooser (JFileChooser.)
        return-flag (.showSaveDialog file-chooser parent-component)]
    (if (= return-flag JFileChooser/APPROVE_OPTION)
      (.getSelectedFile file-chooser)
      nil)))

(defn default-frame []
  (doto (JFrame. "File Picker")
    (.add (JButton. " aaa"))
    (.setFocusable true)
    (.setDefaultCloseOperation JFrame/DISPOSE_ON_CLOSE)
    (.setPreferredSize (Dimension. 400 400))
    (.setVisible true)))

(defn test-file-picker []
  (save-location-picker (default-frame)))


