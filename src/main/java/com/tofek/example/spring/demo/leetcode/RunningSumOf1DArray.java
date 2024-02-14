package com.tofek.example.spring.demo.leetcode;

public class RunningSumOf1DArray {
    /**
     * Easy
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     * Return the running sum of nums.
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(runningSum(nums));
    }


    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = nums[0];
        result[0] = sum;
        for(int i=1; i<nums.length;i++){
            result[i] = sum+nums[i];
            sum = sum +nums[i];
        }
        return result;
    }
}
