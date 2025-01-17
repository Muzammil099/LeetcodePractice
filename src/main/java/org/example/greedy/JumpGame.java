package org.example.greedy;

/*

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.
* */

public class JumpGame {

    public boolean canJump(int[] nums) {

        int furthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > furthest) {
                return false; // Cannot reach this index
            }
            furthest = Math.max(furthest, i + nums[i]);
            if (furthest >= nums.length - 1) {
                return true; // Can reach the last index
            }
        }
        return false; // Should not reach here, just for completeness
    }
}
