package com.codewithhabeeb;

import java.util.Arrays;

public class rotateArray {
    static void reverse(int start, int end, int[] nums){
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    static void arrayRotation(int [] nums, int k){
        k %= nums.length;
        reverse(0, nums.length-1, nums);
        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);
    }

    public static void main(String[] args){
        int[] arr = { 5, 10, 15, 20 };
        arrayRotation(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
