(ns com.mrmccue.conway
  (:import [java.awt Color Dimension Graphics]
           [javax.swing JPanel JFrame Timer]
           [java.awt.event ActionListener KeyListener]))

(defn make-game-of-life
  ([initially-filled]
   {:alive (into #{} initially-filled)})
  ([]
   {:alive #{}}))


(defn make-cell [x y]
  {:x x :y y})

(defn filled [game-of-life]
  (:alive game-of-life))

(defn- neighboring-cells [cell]
  (let [{:keys [x y]} cell
        neighbor-fns [[dec dec]
                      [dec identity]
                      [dec inc]
                      [identity dec]
                      [identity inc]
                      [inc dec]
                      [inc identity]
                      [inc inc]]
        neighbors (for [[x-fn y-fn] neighbor-fns]
                    (make-cell (x-fn x) (y-fn y)))]
    neighbors))

(defn- alive-neighbors [game-of-life cell]
  (let [{:keys [alive]} game-of-life
        neighbors (neighboring-cells cell)
        not-open-neighbors (filter (fn [cell]
                                     (contains? alive cell))
                                   neighbors)]
    (set not-open-neighbors)))

(defn- who-dies [game-of-life]
  (let [{:keys [alive]} game-of-life
        to-die (filter
                 (fn [cell]
                   (not (contains? #{2 3}
                                   (count (alive-neighbors game-of-life cell)))))
                 alive)]
    (set to-die)))

(defn- who-is-born [game-of-life]
  (let [{:keys [alive]} game-of-life
        all-neighbors (mapcat identity
                              (for [cell alive]
                                (neighboring-cells cell)))
        count-of-neighbors (frequencies all-neighbors)
        has-3-neighbors (filter
                          (fn [cell]
                            (= (get count-of-neighbors cell) 3))
                          (keys count-of-neighbors))
        to-be-born (filter
                     (fn [cell]
                       (nil? (get alive cell)))
                     has-3-neighbors)]
    (set to-be-born)))


(defn advance [game-of-life]
 (let [{:keys [alive]} game-of-life
       to-die (who-dies game-of-life)
       to-be-born (who-is-born game-of-life)]
   (assoc game-of-life
          :alive
          (-> alive
              (clojure.set/difference to-die)
              (clojure.set/union to-be-born)))))

;; ----------------------------------------------------------------------------


(def starting-cells #{;; Gosper Glider gun
                      (make-cell 1 5)
                      (make-cell 2 5)
                      (make-cell 1 6)
                      (make-cell 2 6)
                      (make-cell 11 5)
                      (make-cell 11 6)
                      (make-cell 11 7)
                      (make-cell 12 4)
                      (make-cell 13 3)
                      (make-cell 14 3)
                      (make-cell 12 8)
                      (make-cell 13 9)
                      (make-cell 14 9)
                      (make-cell 15 6)
                      (make-cell 16 4)
                      (make-cell 17 5)
                      (make-cell 17 6)
                      (make-cell 17 7)
                      (make-cell 18 6)
                      (make-cell 16 8)
                      (make-cell 21 3)
                      (make-cell 21 4)
                      (make-cell 21 5)
                      (make-cell 22 3)
                      (make-cell 22 4)
                      (make-cell 22 5)
                      (make-cell 23 2)
                      (make-cell 23 6)
                      (make-cell 25 1)
                      (make-cell 25 2)
                      (make-cell 25 6)
                      (make-cell 25 7)
                      (make-cell 35 3)
                      (make-cell 35 4)
                      (make-cell 36 3)
                      (make-cell 36 4)})

(def field-width 50)
(def field-height 30)
(def point-size 15)
(def square-color Color/BLACK)

(defn game-panel [game-of-life-atom]
  (proxy [JPanel ActionListener KeyListener] []
    (paintComponent [g]
      (proxy-super paintComponent g)
      (let [game-of-life @game-of-life-atom]
        (doseq [{:keys [x y]} (filled game-of-life)]
          (.setColor g square-color)
          (.fillRect g
                     (* x point-size)
                     (* y point-size)
                     point-size
                     point-size))))
    (getPreferredSize []
      (Dimension. (* (inc field-width) point-size)
                  (* (inc field-height) point-size)))
    ;; ActionListener
    (actionPerformed [_]
      (.repaint this))
    ;; KeyListener
    (keyPressed [_]
      (swap! game-of-life-atom advance))
    (keyReleased [_])
    (keyTyped [_])))

(defn game []
  (let [game-of-life-atom (atom (make-game-of-life starting-cells))
        frame (JFrame. "Conways Game of Life")
        panel (game-panel game-of-life-atom)
        timer (Timer. (/ 1 60) panel)
        _ (.setFocusable panel true)
        _ (.addKeyListener panel panel)
        _ (.add frame ^JPanel panel)
        _ (.pack frame)
        _ (.setDefaultCloseOperation frame JFrame/DISPOSE_ON_CLOSE)
        _ (.setVisible frame true)
        _ (.start timer)]
    frame))