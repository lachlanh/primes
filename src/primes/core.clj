(ns primes.core
  (:gen-class))

(def seed 1)

(defn prime?
  [number]
  (= 2 (count (filter #(= (mod number %) 0) (range seed (+ number 1))))))

(defn ten-primes
  []
  (take 10 (filter prime? (range seed 1000))))

(defn -main
  [& args]
  (println "Ten primes")
  (println (ten-primes)))

