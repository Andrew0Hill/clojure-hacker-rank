(use '[clojure.string :only (split triml)])

;; Treat both sets of numbers as linear equations of the form
;; mx+b. This function computes the intersection 'x' for two linear equations.
;; If the resulting x value is a positive integer, the two lines intersect.
;; Otherwise, these two lines do not intersect at an integer value of x.
(defn intersection [m1 m2 b1 b2]
  (if (= m1 m2)
    "NO"
    (let [
           x (/ (- b2 b1) (- m1 m2))
         ]
       (if (and (>= x 0) (integer? x))
        "YES"
        "NO"
       )
    )
  )
)

(let [
          x1_temp (read-line) 
          x1_t (split x1_temp #"\s+") 
          x1 (Integer/parseInt (x1_t 0)) 
          v1 (Integer/parseInt (x1_t 1)) 
          x2 (Integer/parseInt (x1_t 2)) 
          v2 (Integer/parseInt (x1_t 3)) 
        ]
    (println (intersection v1 v2 x1 x2))
)