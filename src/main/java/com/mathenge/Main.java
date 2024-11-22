package com.mathenge;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int[] nums = new int[10];
        int length = 0;

        for (int i = 0; i < 6; i++) {
            nums[length] = i;
            length++;
        }

        length--;

//        for (int i = 1; i < length; i++) {
//            nums[i - 1] = nums[i];
//        }
//        length--;

        //delete index 2
        for (int i = 3; i < length; i++) {
            nums[i - 1] = nums[i];
        }
        length--;

        for (int i = 0; i < length; i++) {
            System.out.println("element at index: " + i + " is: " + nums[i]);
        }
    }
}