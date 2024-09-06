package com.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 5};

        int element = LargestElementAlgo(nums);
        System.out.println("The Largest element is: " + element);
    }
    public static int LargestElementAlgo(int[] nums){
        int maxEle = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > maxEle){
                maxEle = nums[i];
            }
        }
        return maxEle;
    }

}
