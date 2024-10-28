package com.mathenge.questions;

public class NumbersWithEvenNumberOfDigits {

    /**
     * Given an array nums of integers, return how many of them contain an even number of digits.
     *
     * Input: nums = [555,901,482,1771]
     * Output: 1
     * Explanation:
     * Only 1771 contains an even number of digits.
     */

    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int length = String.valueOf(nums[i]).length();
            if(length % 2 == 0) {
                System.out.println("-------- even number of digits: " + nums[i] + " ------------------");
                count += 1;
            }
        }
        return count;
    }

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        NumbersWithEvenNumberOfDigits numbersWithEvenNumberOfDigits = new NumbersWithEvenNumberOfDigits();
        int[] nums = new int[]{12,345,2,6,7896};
        System.out.println("-------- count: " + numbersWithEvenNumberOfDigits.findNumbers(nums) + " ------------------");
    }
}
