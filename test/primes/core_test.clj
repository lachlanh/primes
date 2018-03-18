(ns primes.core-test
  (:require [clojure.test :refer :all]
            [primes.core :refer :all]))

(deftest is-one-prime
  (testing "strict prime definition says 2 divisors, 1 is not a prime"
    (is (not (prime? 1)))))

(deftest is-two-prime
  (testing "strict prime definition says 2 divisors"
    (is (prime? 2))))
