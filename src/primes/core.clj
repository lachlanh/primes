(ns primes.core
  (:gen-class))

(def seed 1)

(defn generator-range
  [max]
  (cons 2 (take-nth 2 (range seed max))))

(defn prime?
  [n]
  (= 2 (count (filter #(= (mod n %) 0) (generator-range (inc n))))))

(defn n-primes
  [n]
  (take n (filter prime? (generator-range Integer/MAX_VALUE))))

(defn ten-primes
  []
  (n-primes 10))

(defn create-matrix
  [coll]
  (map (fn [m] (map (fn [n] (* m n)) coll)) coll))

(defn print-row
  [col coll]
  (prn (map #(format "%5d" %) (cons col coll))))

(defn print-matrix
  [coll matrix]
  (print-row nil coll)
  (doseq [i (range 0 (count coll))]
    (print-row (get (vec coll) i) (get (vec matrix) i))))

(defn -main
  [& args]
  (println "Ten primes")
  (let [primes (ten-primes)
        matrix (create-matrix primes)]
    (print-matrix primes matrix)))

