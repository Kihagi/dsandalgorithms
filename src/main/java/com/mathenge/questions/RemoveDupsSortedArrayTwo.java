package com.mathenge.questions;

public class RemoveDupsSortedArrayTwo {

    /**
     * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
     *
     * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
     *
     * Return k after placing the final result in the first k slots of nums.
     *
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     */

    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) {
            return nums.length;
        }

        int index = 2;

        for(int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        RemoveDupsSortedArrayTwo obj = new RemoveDupsSortedArrayTwo();
        int index = obj.removeDuplicates(nums);
        System.out.println(index);

        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
