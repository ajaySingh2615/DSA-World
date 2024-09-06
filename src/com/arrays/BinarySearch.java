package com.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        var key = 10;

        System.out.println(BinarySearchAlgo(nums, key));
    }
    public static int BinarySearchAlgo(int[] nums, int key){
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(nums[mid] == key){
                return mid+1;
            }else if(nums[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}
