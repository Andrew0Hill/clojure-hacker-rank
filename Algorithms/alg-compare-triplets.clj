(use '[clojure.string :only (split triml)])

(defn pscore [score]
    (if (nil? score)
        0
        score
    )
)

(
        let [
          a0_temp (read-line) 
          a0_t (split a0_temp #"\s+") 
          a_arr (map #(Integer/parseInt %) a0_t)
        ]

      (
        let [
          b0_temp (read-line) 
          b0_t (split b0_temp #"\s+") 
          b_arr (map #(Integer/parseInt %) b0_t)
          comp_arr (frequencies (map #(compare %1 %2) a_arr b_arr))
          a_score (get comp_arr 1)
          b_score (get comp_arr -1)
        ]
        (println (str (pscore a_score) " " (pscore b_score)))
      )

)