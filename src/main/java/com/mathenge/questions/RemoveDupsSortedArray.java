package com.mathenge.questions;

public class RemoveDupsSortedArray {

    /**
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
     * unique element appears only once. The relative order of the elements should be kept the same.
     * Then return the number of unique elements in nums.
     *
     * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
     *
     * Change the array nums such that the first k elements of nums contain the unique elements in the order they were
     * present in nums initially. The remaining elements of nums are not important as well as the size of nums.
     * Return k.
     */

//    public int removeDuplicates(int[] nums) {
//        int index = 1;
//
//        for(int i = 0; i < nums.length - 1; i++) {
//            if(nums[i] != nums[i + 1]) {
//                nums[index++] = nums[i + 1];
//            }
//        }
//        return index;
//    }

    public int removeDuplicates2(int[] nums) {
        int index = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        RemoveDupsSortedArray removeDupsSortedArray = new RemoveDupsSortedArray();
        int[] nums = new int[]{1,1,2,2,3,3,4};
        removeDupsSortedArray.removeDuplicates2(nums);
    }
}
