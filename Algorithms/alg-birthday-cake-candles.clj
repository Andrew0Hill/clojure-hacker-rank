(use '[clojure.string :only (split triml)])

;; Get the maximum element of the list, then count the frequency of that element.
(let [
      n_t (read-line) 
      n (Integer/parseInt n_t)
      height_temp (read-line) 
      height_t (split height_temp #"\s+") 
      height (map #(Integer/parseInt %) height_t) 
      max (apply max height)
      num (get (frequencies height) max)
     ]
    (println num)
)