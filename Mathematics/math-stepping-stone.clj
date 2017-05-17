;; We can use the formula for the sum of consecutive integers to solve the problem.
;; F(n) = .5(n(n+1))
;; In this case we are given F(n), so we can solve for 'n' which is the number of steps.
;; .5n^2 +.5n - F(n) = 0
;; Solve using the quadratic formula to get the equation:
;; n = -0.5 + sqrt( .25 + 2(F(n)) )
;; We are only interested in the positive root, so we don't need to calculate both of the roots.
;; If n is an integer, we know that we can reach this number in an integer number of steps. 
;; Any non-integer value means the number is not a sum of consecutive integers.
(defn reachable [n]
  (let [val (- (Math/sqrt (+ 0.25 (* 2 n))) 0.5)]
    (if (zero?  (mod val 1))
      (str "Go On Bob " (int val))
      "Better Luck Next Time"
    )
  )
)

(let [raw (read-line)]
    (doseq [line (line-seq (java.io.BufferedReader. *in*))]
        (println (reachable (Long/parseLong line)))
    )
)