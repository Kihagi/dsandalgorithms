package com.mathenge.questions;

import java.util.HashMap;

public class ContainsDuplicate {

    /**
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     */



    /**
     * Brute Force Approach.
     * Loops through the array checking if each value matches.
     * Uses O(n2) Time Complexity
     */
    public boolean containsDuplicateBrute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Optimized approach
     * Uses O(n) Time Complexity
     */
    public boolean containsDuplicateOpt(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }


    /**
     * Driver Code
     */
    public static void main(String[] args) {
        int[] num = {1,2,3,1};
        ContainsDuplicate c = new ContainsDuplicate();
        System.out.println(c.containsDuplicateBrute(num));
    }
}
