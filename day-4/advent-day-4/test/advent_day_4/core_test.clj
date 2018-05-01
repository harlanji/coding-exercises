(ns advent-day-4.core-test
  (:require [clojure.test :refer :all]
            [advent-day-4.core :refer [count-word valid-passphrase?]]))


(deftest  count-word-test
  (testing "Counting"
    (is (= {"abcd" 1} (count-word {} "abcd")))
    (is (= {"abcd" 2} (count-word {"abcd" 1} "abcd")))
    (is (= {"abc" 1 "abcd" 1} (count-word {"abc" 1} "abcd")))))

(deftest passphrases-test
  (testing "Passphrases"
    (is (= true (valid-passphrase? "abcd")))
    (is (= true (valid-passphrase? "")))
    (is (= true (valid-passphrase? "       ")))
    (is (= true (valid-passphrase? "abcd abcde")))    
    (is (= false (valid-passphrase? "abcd abcd")))  
    ))
