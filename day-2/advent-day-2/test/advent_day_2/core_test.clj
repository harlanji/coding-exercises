(ns advent-day-2.core-test
  (:require [clojure.test :refer :all]
            [advent-day-2.core :refer [range-diff checksum]]))

(deftest range-diff-arity-0
  (testing "Empty row"
    (is (= 0 (range-diff [])))))

(deftest range-diff-arity-1
  (testing "Row lenth one"
    (is (= 0 (range-diff [-1])))
    (is (= 0 (range-diff [0])))
    (is (= 0 (range-diff [1])))))
    
    
(deftest range-diff-arity-2-neg
  (testing "Row length two with negatives"
    (is (= 0 (range-diff [0 0])))
    (is (= 0 (range-diff [-1 -1])))
    (is (= 1 (range-diff [-1 0])))
    (is (= 1 (range-diff [0 -1])))
    (is (= 1 (range-diff [-1 -2])))
    (is (= 1 (range-diff [-2 -1])))))
    
(deftest range-diff-arity-2-pos
  (testing "Row length two with positives"
    (is (= 0 (range-diff [0 0])))
    (is (= 0 (range-diff [1 1])))
    (is (= 1 (range-diff [1 0])))
    (is (= 1 (range-diff [0 1])))
    (is (= 1 (range-diff [1 2])))
    (is (= 1 (range-diff [2 1])))))
    
    

(deftest range-diff-arity-3
  (testing "Row length three"
    (is (= 0 (range-diff [0 0 0])))
    (is (= 0 (range-diff [1 1 1])))
    (is (= 1 (range-diff [-1 -2 -1])))))
    
    
(deftest checksum-zero
  (testing "Zero checksums"
    (is (= 0 (checksum [[]])))
    (is (= 0 (checksum [[0]])))
    (is (= 0 (checksum [[1]])))
    (is (= 0 (checksum [[0] [0]])))
    (is (= 0 (checksum [[1] [2]])))))
    

(deftest checksum-1
  (testing "One checksums"
    (is (= 1 (checksum [[0 1] [0]])))
    (is (= 1 (checksum [[1 2 2] [2]])))))
    
(deftest checksum-2
  (testing "Two checksums"
    (is (= 2 (checksum [[0 1] [0] [1 2]])))
    (is (= 2 (checksum [[1 2 3] [2]])))
    (is (= 2 (checksum [[-1 1 1] [2]])))
))  
    
    
    
(def sample-input [[5 1 9 5]
                   [7 5 3]
                   [2 4 6 8]])   
            

(deftest checksum-sample
  (testing "Row length three"
    (is (= 18 (checksum sample-input)))))            
             
    