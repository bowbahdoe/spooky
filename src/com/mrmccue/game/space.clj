(ns com.mrmccue.game.space
  (:import [javax.swing JFrame WindowConstants JPanel]
           [java.awt Dimension BorderLayout Color]))

(def window-width 1000)
(def window-height 600)
(def window-dim (Dimension. window-width window-height))
(def background-color Color/BLACK)

(defn make-ui []
  (doto (JFrame.)
    (.setSize window-dim)
    (.setPreferredSize window-dim)
    (.setResizable false)
    (.setDefaultCloseOperation WindowConstants/EXIT_ON_CLOSE)
    (.setFocusable true)
    (.requestFocus)
    (.setContentPane (doto (JPanel. (BorderLayout.))
                       (.setBackground background-color)))
    (.pack)))
