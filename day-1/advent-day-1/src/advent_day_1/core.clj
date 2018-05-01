(ns advent-day-1.core)

; 1122 produces a sum of 3 (1 + 2) because the first digit (1) matches the second digit and the third digit (2) matches the fourth digit.
; 1111 produces 4 because each digit (all 1) matches the next.
; 1234 produces 0 because no digit matches the next.
; 91212129 produces 9 because the only digit that matches the next one is the last digit, 9.



(defn sum-pin [pin]
  "Review a sequence of digits (your puzzle input) and 
   find the sum of all digits that match the next digit 
   in the list. The list is circular, so the digit after 
   the last digit is the first digit in the list."
   
   (comment "Implemented by appending first digit to end,
     then iterating and comparing with previous digit.
     Since it's an O(n) time check we move to O(n+1).
     We double space since a new string will need to be
     allocated. We could have used a modular next/prev char
     function on the length of the input string, but this approach
     let us avoid managing a pointer or seeking with each iteration.")

  (let [prev-digit (atom nil)
        working-pin (str pin (first pin))
        sum (atom 0)]
	  (doseq [digit working-pin]
	    (when (= digit @prev-digit)
	      (swap! sum + (Integer/parseInt (str digit))))
	    (reset! prev-digit digit))
	  @sum))
	  

(defn -main
  [& args]
  (if (< 1 (count args))
    (println "Usage: sum-pin pin")
	  (println (sum-pin (first args)))))