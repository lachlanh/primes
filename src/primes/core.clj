(ns primes.core
  (:gen-class))

(defn prime?
  [number]
  (not (some #(= (mod number %) 0) (range 2 number))))

(defn ten-primes
  []
  (take 10 (filter prime? (range 1 1000))))

(defn -main
  [& args]
  (println "Ten primes")
  (println (ten-primes)))

