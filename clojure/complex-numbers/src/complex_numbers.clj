(ns complex-numbers)



(defn real [[a b]] ;; <- arglist goes here
  a)

(defn imaginary [[a b]] ;; <- arglist goes here
  b)

(defn abs [[a b]] ;; <- arglist goes here 
  (Math/sqrt (+ (* a a) (* b b))))

(defn conjugate [[a b]] ;; <- arglist goes here
  [a (- b)])

(defn add [[a b] [c d]] ;; <- arglist goes here
  [(+ a c) (+ b d)])

(defn sub [[a b] [c d]] ;; <- arglist goes here
  [(- a c) (- b d)])

(defn mul [[a b] [c d]] ;; <- arglist goes here
  [(+ (* a c) (* (- b) d)) (+ (* a d) (* b c))])

(defn div [[a b] [c d]] ;; <- arglist goes here
  (let [den_abs (abs [c d])]
    (mul [(/ a den_abs) (/ b den_abs)] (conjugate [c d]))))
