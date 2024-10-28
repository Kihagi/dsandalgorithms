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

    public int[] sortedSquares(int[] nums) {
        Arrays.sort(nums);
        int[] squares = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int squared = nums[i] * nums[i];
            squares[i] = squared;
        }
        Arrays.sort(squares);
        return squares;
    }

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] squares =  squaresOfSortedArray.sortedSquares(nums);
        for (int square : squares) {
            System.out.print(square + " , ");
        }
    }
}
