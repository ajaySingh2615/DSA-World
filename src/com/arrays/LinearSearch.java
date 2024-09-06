package com.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int result = LinearSearchAlgo(nums, key);
        if(result == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Element is found at index " + (result + 1));
        }
    }

    public static int LinearSearchAlgo(int[] nums, int key){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == key) return i;
        }
        return -1;
    }

}
