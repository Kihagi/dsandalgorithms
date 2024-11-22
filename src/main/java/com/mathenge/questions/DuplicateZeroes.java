package com.mathenge.questions;

public class DuplicateZeroes {
    /**
     * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
     *
     * Input: arr = [1,0,2,3,0,4,5,0]
     * Output: [1,0,0,2,3,0,0,4]
     * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
     */

    public void duplicateZeros(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                for (int j = nums.length - 1; j > i; j--) {
                    nums[j] = nums[j - 1];
                }
                i++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println("item at index" + i + " is " + nums[i]);
        }
    }

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        DuplicateZeroes duplicateZeroes = new DuplicateZeroes();
        int[] nums = new int[]{1,0,2,3,0,4,5,0};
        duplicateZeroes.duplicateZeros(nums);
    }
}
