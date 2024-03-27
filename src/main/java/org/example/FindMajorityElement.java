package org.example;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 Boyer-Moore Majority Voting Algorithm
 */
public class FindMajorityElement {

    public static void main(String[] args) {
        majorityElement(new int[]{1});
    }
    public static int majorityElement(int[] nums) {

        int candidate = nums[0];
        int votes = 1;

        for(int i = 1 ; i< nums.length; i++){
            if(votes == 0){
                candidate = nums[i];
            }

            votes += nums[i] == candidate ? 1 : -1;
        }

        return candidate;
    }

}
