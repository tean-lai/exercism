(ns difference-of-squares)


(defn sum-of-squares [n]
  (quot (* n (+ n 1) (+ (* 2 n) 1)) 6))

(defn square-of-sum [n]
  (let [sum (quot (* n (inc n)) 2)] (* sum sum)))

(defn difference [n]
  (-  (square-of-sum n) (sum-of-squares n)))