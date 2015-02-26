;;Author Binay Mishra
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

;;Conbination [eg. nCr ] 
(defn combination
  [n r]
  (if (>= n r)
      (/ (factorial n) (* (factorial r) (factorial (- n r ))))))

;;Fibonacci Term. [e g. (fibonacci-term [0 1]) ]
(defn fibonacci-term
  [ [a b] ] 
  [b (+' a b )])

;;Fibonacci Series [e.g fibonacci series up to 5 is (fibonacci-series 5)]
(defn fibonacci-series
  [n]
  (take n (map first (iterate fibonacci-term [0 1]))))