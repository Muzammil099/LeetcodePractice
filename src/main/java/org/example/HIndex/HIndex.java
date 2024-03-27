package org.example.HIndex;

/*

Code
Testcase
Testcase
Test Result
274. H-Index
Solved
Medium
Topics
Companies
Hint
Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.



Example 1:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
Example 2:

Input: citations = [1,3,1]
Output: 1
*/

import java.util.Arrays;

public class HIndex {

    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }

    //2nd solution

    public int hIndexSecond(int[] citations) {
        int l = 0;
        int h = citations.length;

        while(l <= h) {
            int mid = l + (h - l) / 2;
            int count = 0;

            for(int i: citations) {
                if (i >= mid) {
                    count++;
                }
            }

            if (count < mid) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }

        return h;
    }
}
