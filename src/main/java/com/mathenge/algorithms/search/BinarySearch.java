package com.mathenge.algorithms.search;

public class BinarySearch {

    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            //Find mid element
            int mid = start + (end - start) / 2;
            //if target < mid then ignore the right side
            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    /**
     * Driver Code
     */
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 9, 13, 15, 17, 24, 35, 46, 57, 78};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(nums, 17));
    }
}
