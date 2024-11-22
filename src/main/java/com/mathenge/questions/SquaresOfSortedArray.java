package com.mathenge.questions;
import java.util.Arrays;
public class SquaresOfSortedArray {
    /**
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     *
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     */

    public int[] sortedSquaresBrute(int[] nums) {
        int[] squares = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int squared = nums[i] * nums[i];
            squares[i] = squared;
        }
        Arrays.sort(squares);
        return squares;
    }

    public int[] sortedSquaresOptimized(int[] nums) {
        //Create new array to house the new items
        int[] results = new int[nums.length];

        int head = 0;
        int tail = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            nums[i]*=nums[i];
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[head] > nums[tail]) {
                results[j] = nums[head];
                head++;
            } else {
                results[j] = nums[tail];
                tail--;
            }
        }
        return results;
    }

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] squares =  squaresOfSortedArray.sortedSquaresOptimized(nums);
        for (int square : squares) {
            System.out.print(square + " , ");
        }
    }
}
