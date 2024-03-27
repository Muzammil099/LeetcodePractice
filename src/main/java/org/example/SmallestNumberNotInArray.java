package org.example;

import java.util.HashSet;

public class SmallestNumberNotInArray {

    public int solution(int[] A) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : A){
            set.add(num);
        }

        int smallestNum = 1;

        while(set.contains(smallestNum)){
            smallestNum++;
        }

        return  smallestNum;
    }
}
