(ns eu2.core)

(defn fib [n]
  (if (<= n 2)
    n
    (+ (fib (- n 1))
       (fib (- n 2)))))

(def fib (memoize fib))
(def fibs (map fib (iterate inc 1)))

(apply + (filter even? (take-while #(< % 4000000) fibs)))
