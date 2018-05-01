(ns advent-day-2.core)

(defn range-diff [row]
  "Finds the difference between the extreme values in a row"
  (if (< (count row) 1)
      0
		(let [diff (reduce (fn [{:keys [row-min row-max]} item]
		                     {:row-min (min row-min item)
		                      :row-max (max row-max item)}) 
		                   {:row-min (Integer/MAX_VALUE)
		                    :row-max (Integer/MIN_VALUE)}
			                row)]
			(java.lang.Math/abs (- (:row-min diff) (:row-max diff))))))
  
 

(defn checksum [input]
  "Adds the difference between extremes of each row of a matrix"
  (let [diffs (map range-diff input)]
    (reduce + 0 diffs)))