package org.example.arrays;

/*
It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue from  to . Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker. One person can bribe at most two others.

Determine the minimum number of bribes that took place to get to a given queue order. Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.

Example


If person  bribes person , the queue will look like this: . Only  bribe is required. Print 1.


Person  had to bribe  people to get to the current position. Print Too chaotic.
 */

import java.util.List;

public class NoOfBribes {

    public static void minimumBribes(List<Integer> q) {
        // Write your code here

        int n = q.size();
        int noOfBribes = 0;

        //reverse iterate
        for (int i = n-1; i >= 0 ; i--) {


            if(q.get(i) - (i + 1) > 2){
                System.out.println("Too Chaotic");
                return;
            }

            for (int j = Math.max(0, q.get(i) - 2); j < i; j++) {
                if(q.get(j) > q.get(i)){
                    noOfBribes++;
                }
            }

        }

        System.out.println(noOfBribes);

    }

    public static void main(String[] args) {
        minimumBribes(List.of(2, 5, 1, 3, 4

        ));
    }
}
