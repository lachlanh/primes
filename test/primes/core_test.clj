(ns primes.core-test
  (:require [clojure.test :refer :all]
            [primes.core :refer :all]))

(def calculated-ten-primes (list 2 3 5 7 11 13 17 19 23 29))

(deftest is-one-prime
  (testing "strict prime definition says 2 divisors, 1 is not a prime"
    (is (not (prime? 1)))))

(deftest is-two-prime
  (testing "strict prime definition says 2 divisors"
    (is (prime? 2))))

(deftest first-ten-primes
  (testing "can we generate the first ten primes"
    (is (= (ten-primes) calculated-ten-primes))))
