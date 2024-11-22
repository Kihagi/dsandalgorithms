package com.mathenge.questions;

public class LC1346CheckIfNandItsDoubleExist {

    /**
     * Given an array arr of integers, check if there exist two indices i and j such that :
     *
     * i != j
     * 0 <= i, j < arr.length
     * arr[i] == 2 * arr[j]
     */

    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
               if(arr[i] == 2 * arr[j] && i != j) {
                   return true;
               }
           }
        }
        return false;
    }


    /**
     * Driver Code
     */
    public static void main(String[] args) {
        LC1346CheckIfNandItsDoubleExist checkIfNandItsDoubleExist = new LC1346CheckIfNandItsDoubleExist();
        int[] nums = new int[]{10,2,5,3};
        checkIfNandItsDoubleExist.checkIfExist(nums);
    }
}
