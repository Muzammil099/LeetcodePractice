package org.example;

/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class RemoveValInPlace {

    public static void main(String[] args) {
        removeElement(new int[]{1},1);
    }
    public static int removeElement(int[] nums, int val) {


        int i = 0; // Pointer for iterating through the array
        int n = nums.length; // Length of the array

        // Iterate through the array
        while (i < n) {
            // If the current element is equal to the target value,
            // replace it with the last non-target element in the array
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--; // Reduce the size of the array
            } else {
                // Move to the next element if it's not equal to the target value
                i++;
            }
        }

        // Return the length of the modified array
        return n;
    }

}
