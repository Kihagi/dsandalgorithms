package com.mathenge.questions;

public class LC941ValidMountainArray {

    /**
     * Given an array of integers arr, return true if and only if it is a valid mountain array.
     *
     * Recall that arr is a mountain array if and only if:
     *
     * arr.length >= 3
     * There exists some i with 0 < i < arr.length - 1 such that:
     * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
     * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     */
    public boolean validMountainArray(int[] arr) {
        int length = arr.length;
        if(length <= 3) {
            return false;
        }

        int i = 0 ,j = length - 1;

        while ((i + 1 < length) && (arr[i] < arr[i + 1])) {
            i++;
        }

        while ((j > 0) && (arr[j] < arr[j - 1])) {
            j--;
        }

        if(i > 0 && j < length - 1) {
            if (i == j) {
                return true;
            }
        }
        return false;
    }


    /**
     * Driver Code
     */
    public static void main(String[] args) {
        LC941ValidMountainArray validMountainArray = new LC941ValidMountainArray();
        int[] nums = new int[]{0,3,2,1};
        validMountainArray.validMountainArray(nums);
    }
}
