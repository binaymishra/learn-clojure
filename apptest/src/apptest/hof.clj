(ns apptest.hof)

(defn hof-test
  []
  (println "hof.clj It's working...!"))

;; Fractorial Using Higher Order Function.[eg. (factorial 10) ]
(defn factorial
  [n]
  (if (zero? n)
    1
    ( * (reduce * (range 1N n)) n)))