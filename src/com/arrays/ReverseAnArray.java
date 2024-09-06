package com.arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};

        ReverseAnArrayAlgo(nums);
        printArray(nums);

    }

    public static void ReverseAnArrayAlgo(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
