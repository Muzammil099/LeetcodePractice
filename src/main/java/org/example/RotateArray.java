package org.example;

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 */
public class RotateArray {

    public static void main(String[] args) {
        rotate(new int[]{1}, 3);
    }
    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n; // handle cases where k > n

        reverse(nums, 0, n - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, n - 1); // Reverse the last n - k elements

    }

    // Helper function to reverse array elements within the given range
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
