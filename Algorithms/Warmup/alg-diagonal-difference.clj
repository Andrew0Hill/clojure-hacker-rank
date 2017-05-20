(use '[clojure.string :only (split triml)])

;; Define a partial-diff function that computes the difference between the two diagonal elements in each row.
(defn partial-diff [vc ind]
    (let [lastind (dec (count vc)) t-ind (- lastind ind)]
        (- (get vc ind) (get vc t-ind))
    )
)

;; Call diag-diff on each row in the matrix with an offset to get the elements of the diagonal 
;; in that row. (first and last elements in the first row, second and second-to-last elements in the second row, etc.)
;; Then, sum the resulting list of partial differences and take the absolute value.
(defn diag-diff [matrix dim]
    (Math/abs (apply + (map #(partial-diff %1 %2) matrix (range dim))))
)

;; Read in the dimensions of the matrix and the matrix itself.
;; Print the value of diagonal difference of the matrix.
(let [n_t (read-line) 
      n (Integer/parseInt n_t) 
      a (into [] (for [a_temp (range n)]  (mapv #(Integer/parseInt %) (split (read-line) #"\s+"))))]
    (println (diag-diff a n))
)