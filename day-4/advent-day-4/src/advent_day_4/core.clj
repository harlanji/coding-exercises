(ns advent-day-4.core
  (:require [clojure.string :as str]))

(defn count-word [words word]
  "Increments the word count in a dictionary for a given word"
  (assoc words word (inc (get words word 0))))

(defn valid-passphrase? [passphrase]
  "Checks that a passphrase has no duplicate words"
  (let [words (str/split (str/trim passphrase) #" ")
        word-counts (reduce count-word {} words)
        max-count (apply max (vals word-counts))]
    (>= 1 max-count)))