package com.arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {1, -2, 6, -1, 3};
        maximumSubArraySumUsingBruteForceAlgo(nums);
    }

    public static void maximumSubArraySumUsingBruteForceAlgo(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += nums[k];
                }
                System.out.println(currSum);
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("Maximum sum = " + maxSum);
    }

}
