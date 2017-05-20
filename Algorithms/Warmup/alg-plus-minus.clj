(use '[clojure.string :only (split triml)])
;; Use the 'filter' function to get sublists of all positive, zero, and negative elements.
;; Count the size, then get the decimal value of the fraction for each sublist.
(let [
      n_t (read-line) 
      n (Integer/parseInt n_t) 
      arr_temp (read-line) 
      arr_t (split arr_temp #"\s+") 
      arr (map #(Integer/parseInt %) arr_t) 
     ]
    (println (double (/ (count (filter #(< 0 %) arr)) n)) )
    (println (double (/ (count (filter #(> 0 %) arr)) n)) )
    (println (double (/ (count (filter #(zero? %) arr)) n)) )
)