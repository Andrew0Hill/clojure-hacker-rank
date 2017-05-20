(use '[clojure.string :only (split triml)])

;; Gets returns the next (higher) multiple of m given a number n.
(defn next-mult [n m]
    (int (* (Math/ceil (/ n m)) m))
)

;; Rounds the grade.
(defn round-grade [grade]
    (let [fv-mult (next-mult grade 5)]
        (if (or (< grade 38) (>= (- fv-mult grade) 3))
        grade
        fv-mult
        )
    )

)
(let [
    n_t (read-line) 
    n (Integer/parseInt n_t) 
    grades (for [grades_temp (range n)] (Integer/parseInt (read-line)))
     ]
   (doseq [grade grades] 
        (println (round-grade grade))
   )
)