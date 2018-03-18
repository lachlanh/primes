(ns primes.core
  (:gen-class))

(def seed 1)

(defn prime?
  [number]
  (= 2 (count (filter #(= (mod number %) 0) (range seed (+ number 1))))))

(defn ten-primes
  []
  (take 10 (filter prime? (range seed 1000))))

(defn create-matrix
  [coll]
  (map (fn [m] (map (fn [n] (* m n)) coll)) coll))

(defn print-row
  [col coll]
  (prn (map #(format "%5d" %) (cons col coll))))

(defn print-matrix
  [coll matrix]
  (print-row -1 coll)
  (prn (sort (zipmap coll matrix))))

(defn -main
  [& args]
  (println "Ten primes")
  (let [primes (ten-primes)
        matrix (create-matrix primes)]
    (print-matrix primes matrix)))

