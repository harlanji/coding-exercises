(ns advent-day-1.core-test
  (:require [clojure.test :refer [deftest is]]
            [advent-day-1.core :refer [sum-pin]]))

(deftest sum-case-1-test
  (let [input "1122" expected 3]
    (is (= expected (sum-pin input)))))

(deftest sum-case-2-test
  (let [input "1111" expected 4]
    (is (= expected (sum-pin input)))))
    
(deftest sum-case-3-test
  (let [input "1234" expected 0]
    (is (= expected (sum-pin input)))))
    
(deftest sum-case-4-test
  (let [input "91212129" expected 9]
    (is (= expected (sum-pin input)))))