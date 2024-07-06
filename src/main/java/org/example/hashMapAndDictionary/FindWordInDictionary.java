package org.example.hashMapAndDictionary;

import java.util.HashMap;
import java.util.List;

/*
Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

Example
 = "attack at dawn"  = "Attack at dawn"

The magazine has all the right words, but there is a case mismatch. The answer is .
 */
public class FindWordInDictionary {
    public static void checkMagazine(List<String> magazine, List<String> note) {

        HashMap<String, Integer> words = new HashMap<>();

        for (String word: magazine){
            if(words.containsKey(word)){
                words.put(word, words.get(word) + 1);
            }
            else {
                words.put(word, 1);
            }
        }

        for (String word: note){
            if(!words.containsKey(word) || words.get(word) == 0){
                System.out.println("No");
                return;
            }
            words.put(word, words.get(word) - 1);

        }

        System.out.println("Yes");

    }

}
