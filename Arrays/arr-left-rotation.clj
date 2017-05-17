(use '[clojure.string :only (split triml)])

;; Function 'rotate' will generate a the rotated array as a lazy sequence by
;; dropping the first 'shamt' elements from the list, and concatenating the resulting list
;; with the first 'shamt' elements of the list. 
(defn rotate [array shamt]
 (lazy-seq (drop shamt (concat array (take shamt array))))
)
(let [  ;; Read the first line in.
        size-shift (read-line)
        ;; Split on whitespace (creates a vector)
        ssp (split size-shift #"\s+")
        ;; Retrieve the first and second elements of this vector.
        shift (second ssp)
        
        ;; Read second line in.
        arr (read-line)
        ;; Split on whitespace.
        arr-s (split arr #"\s+")
    ]
    ;; Bind 'nums' to the rotated list, and print each element.
    (doseq [nums (rotate arr-s (Integer/parseInt shift))]
        (print (str nums " "))
    )
)