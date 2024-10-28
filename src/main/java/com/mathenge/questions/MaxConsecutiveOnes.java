package com.mathenge.questions;

public class MaxConsecutiveOnes {

    /**
     * Given a binary array nums, return the maximum number of consecutive 1's in the array.
     *
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
     */

    public int findMaxConsecutiveOnes(int[] nums) {
        int currentOnes = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                currentOnes += 1;
                if (currentOnes > max) {
                    max = currentOnes;
                }
            } else {
                currentOnes = 0;
            }
        }
        return max;
    }

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int[] nums = new int[]{1,1,0,1,1,1};
        maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
    }
}
