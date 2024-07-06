package org.example.hashMapAndDictionary;

import java.util.Arrays;
import java.util.HashMap;

/*
Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string. Given a string, find the number of pairs of substrings of the string that are anagrams of each other.

Example

The list of all anagrammatic pairs is  at positions  respectively.


 */
public class AnagramStrings {

    public static int sherlockAndAnagrams(String s) {
        // Write your code here

        HashMap<String, Integer> subStringMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                char[] subString = s.substring(i, j + 1).toCharArray();
                Arrays.sort(subString);
                String sortedSubString = new String(subString);

                subStringMap.put(sortedSubString, subStringMap.getOrDefault(sortedSubString, 0) + 1);

            }

        }

        int count = 0;

        for (int value : subStringMap.values()) {
            // for mular n * (n -1)/2 is for getting all the pairs  for substring as well
            count += (value * (value - 1)) / 2;
        }

        return count;


    }

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("abbaabbaabbaabba"));
    }
}
