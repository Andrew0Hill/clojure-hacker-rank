(use '[clojure.string :only (split triml)])

(let [
    time (read-line)
    tod (clojure.string/join (filter #(Character/isLetter %) time))
    split-tod (clojure.string/join (clojure.string/split time #"[A-Z]"))
    nums (clojure.string/split split-tod #":")
    first (Integer/parseInt (first nums))
    ]
    (if (= first 12)
        (if (= tod "PM")
            (println split-tod)
            (println (str "00:" (nth nums 1) ":" (nth nums 2)))
        )
        (if (= tod "PM")
            (println (str (+ first 12) ":" (nth nums 1) ":" (nth nums 2)))
            (println split-tod)
        )
    )
)