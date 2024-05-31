package com.mathenge.algorithms.search;

import java.util.Arrays;

public class LinearSearch {

    public int find(int[] arr, int target) {
        if(arr == null || arr.length == 0) {
            return -1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int findMin(int[] arr) {
        if(arr == null || arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int[] findIn2DArray(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    /**
     * Driver Code
     */
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int nums[] = {10, 20, 34, 54, 78, -8, 96};
        //System.out.println(ls.find(nums, 78));
        //System.out.println(ls.findMin(nums));
        int[][] matrix = {
                {10, 20, 30, 40, 50, 60, 70},
                {2, 3, 4, 5, 6, 7, 8},
                {15, 25, 35, 45, 55, 65, 75}
        };
        System.out.println(Arrays.toString(ls.findIn2DArray(matrix, 7)));
    }
}
