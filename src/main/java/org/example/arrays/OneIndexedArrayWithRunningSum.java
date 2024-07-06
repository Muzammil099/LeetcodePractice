package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to
each the array element between two given indices, inclusive. Once all operations have been performed,
 return the maximum value in the array.
*/
public class OneIndexedArrayWithRunningSum {

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        List<Integer> rotatedArray = new ArrayList<>(a);
        int n = a.size();
        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - d) % n;

            rotatedArray.set(newIndex, a.get(i));

        }

        return rotatedArray;
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        // Write your code here

        Integer[] sumArray = new Integer[n + 1];
        Arrays.fill(sumArray, 0);

        for (int i = 0; i < queries.size(); i++) {

            int start = queries.get(i).get(0);
            int end = queries.get(i).get(1);
            int value = queries.get(i).get(2);

            sumArray[start] += value;

            if(end + 1 <= n ){
                sumArray[end +1] -= value;
            }
        }

        long maxValue = 0;
        long currentValue = 0;
        for (int i = 1; i <= n; i++) {
            currentValue += sumArray[i];
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }


        return maxValue;

    }
    public static void main(String[] args) {
arrayManipulation(5, List.of(List.of(1,2,100), List.of(2,5,100), List.of(3,4,100)));
    }
}
