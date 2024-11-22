package com.mathenge.questions;

public class LC27RemoveElement {

    /**
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    Return k.
     */

    public int removeElement(int[] nums, int val) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[size] = nums[i];
                size++;
            }
        }
        return size;
    }


    /**
     * Driver Code
     */
    public static void main(String[] args) {
        LC27RemoveElement removeElement = new LC27RemoveElement();
        int[] nums = new int[]{3,2,2,3};
        removeElement.removeElement(nums, 3);
    }
}
