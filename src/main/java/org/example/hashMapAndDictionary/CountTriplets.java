package org.example.hashMapAndDictionary;

/*
You are given an array and you need to find number of tripets of indices  such that the elements at those indices are in geometric progression for a given common ratio  and .

Example


There are  and  at indices  and . Return .
 */

import java.util.*;

public class CountTriplets {

    public static long countTriplets(List<Long> arr, int r) {
        Map<Long, Integer> leftMap = new HashMap<>();
        Map<Long, Integer> rightMap = new HashMap<>();
        Long count = 0L;

        for (int i = 0; i < arr.size(); i++) {

            rightMap.put(arr.get(i), rightMap.getOrDefault(arr.get(i),0) + 1);
        }

        for (int i = 0; i < arr.size() ; i++) {

            int c1 = 0;
            int c3 = 0;
            Long current = arr.get(i);

            rightMap.put(current, rightMap.get(current) - 1);

            if(leftMap.containsKey(current / r) && current % r == 0) {
                c1 = leftMap.getOrDefault(current / r, 0);
            }

            if(rightMap.containsKey(current * r) && current % r == 0) {

                c3 = rightMap.getOrDefault(current * r, 0);
            }

            count += c1 * c3;

            leftMap.put(current, leftMap.getOrDefault(arr.get(i),0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTriplets(List.of(1L, 5L,5L,25L, 125L),5));
    }
}
