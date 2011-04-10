(ns eu1.core)

(defn multiple-3-5? [n]
  (or (zero? (rem n 3))
      (zero? (rem n 5))))

(def integers (iterate inc 1))
(apply + (filter multiple-3-5? (take 999 integers)))

;(apply + (filter multiple-3-5? (range 1 1000)))
