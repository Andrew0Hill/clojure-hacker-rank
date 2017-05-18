(use '[clojure.string :only (split triml)])

;; Function produces a string with n spaces preceding m '#' characters.  
(defn s-line [n m]
    (clojure.string/join (concat (take n (repeat " ")) (take m (repeat "#"))))
)

;; Repeatedly execute the s-line function to produce a "staircase".
(let [n_t (read-line) 
      n (Integer/parseInt n_t)]
    (doseq [x (range 1 (inc n))]
        (println (s-line (- n x) x))
    )
)