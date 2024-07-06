package org.example.hashMapAndDictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
You are given  queries. Each query is of the form two integers described below:
-  : Insert x in your data structure.
-  : Delete one occurence of y from your data structure, if present.
-  : Check if any integer is present whose frequency is exactly . If yes, print 1 else 0.

The queries are given in the form of a 2-D array  of size  where  contains the operation, and  contains the data element.

Example

The results of each operation are:
 */
public class FrequencyCount {

    static List<Integer> freqQuery(List<List<Integer>> queries) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (List<Integer> query : queries) {
            int type = query.get(0);
            int value = query.get(1);

            switch (type) {
                case 1: // Insert x
                    if (frequencyMap.containsKey(value)) {
                        int oldFreq = frequencyMap.get(value);
                        int newFreq = oldFreq + 1;
                        frequencyMap.put(value, newFreq);

                        // Update countMap
                        countMap.put(oldFreq, countMap.getOrDefault(oldFreq, 0) - 1);
                        countMap.put(newFreq, countMap.getOrDefault(newFreq, 0) + 1);
                    } else {
                        frequencyMap.put(value, 1);
                        countMap.put(1, countMap.getOrDefault(1, 0) + 1);
                    }
                    break;

                case 2: // Delete one occurrence of y
                    if (frequencyMap.containsKey(value) && frequencyMap.get(value) > 0) {
                        int oldFreq = frequencyMap.get(value);
                        int newFreq = oldFreq - 1;
                        frequencyMap.put(value, newFreq);

                        // Update countMap
                        countMap.put(oldFreq, countMap.getOrDefault(oldFreq, 0) - 1);
                        if (newFreq > 0) {
                            countMap.put(newFreq, countMap.getOrDefault(newFreq, 0) + 1);
                        }
                    }
                    break;

                case 3: // Check frequency
                    if (countMap.getOrDefault(value, 0) > 0) {
                        result.add(1);
                    } else {
                        result.add(0);
                    }
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        freqQuery(List.of(
            List.of(1,3),
            List.of(2,3),
            List.of(3,2),
            List.of(1,4),
            List.of(1,5),
            List.of(1,5),
            List.of(1,4),
            List.of(3,2),
            List.of(2,4),
            List.of(3,2)
        ));
    }
}
