(use '[clojure.string :only (split triml)])

;; Sum elements in the list. Subtract largest element to get min-sum, subtract
;; smallest element to get max-sum.
(let [arr_temp (read-line) 
      arr_t (split arr_temp #"\s+") 
      arr (map #(Integer/parseInt %) arr_t)
      sum (apply + arr)
      max-sum (- sum (apply min arr))
      min-sum (- sum (apply max arr))
      ]
    (println (str min-sum " " max-sum))
)
