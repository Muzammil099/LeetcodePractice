package org.example;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {

    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }
    public static boolean isAnagram(String s, String t) {

        Map<Character, Integer> sCharCount = new HashMap<>();
        Map<Character, Integer> tCharCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            if(sCharCount.containsKey(sChar)){
                sCharCount.put(sChar, sCharCount.get(sChar) + 1);
            }
            else{
                sCharCount.put(sChar, 1);
            }

            char tChar = t.charAt(i);
            if(tCharCount.containsKey(tChar)){
                tCharCount.put(tChar, tCharCount.get(tChar) + 1);
            }
            else{
                tCharCount.put(tChar, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : sCharCount.entrySet()){

            if(
                    !tCharCount.containsKey(entry.getKey()) ||
                    (tCharCount.containsKey(entry.getKey())
                        && tCharCount.get(entry.getKey()) != sCharCount.get(entry.getKey())
                    )
            ){
                return false;
            }

        }
        return true;
    }
}
