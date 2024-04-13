package org.example;

import java.util.ArrayList;
import java.util.List;

public class MinRelocation {

    public static void main(String[] args) {
        solution(new int[]{5, -2, -3, 1});
    }
    public static int solution(int[] A) {
        int count = 0;
        int currentSum = 0;
        int prevSum = 0;


        for(int num: A){
            prevSum = currentSum;
            currentSum += num;

            if(currentSum <= 0){
                count++;
                currentSum = prevSum;
            }
        }

        return count;
    }
}
