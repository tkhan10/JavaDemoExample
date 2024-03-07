package com.tofek.example.spring.demo.leetcode.slidewindow;

import java.util.Arrays;

public class Minimum_Difference_Between_Highest_And_Lowest_KScores_1984 {

    public static void main(String[] args) {
        int[]  nums = new int[]{9,4,1,7};
        int k = 2;

        minimumDifferenceBetweenHighestAndLowestKScores(nums, k);
    }

    private static int minimumDifferenceBetweenHighestAndLowestKScores(int[] nums, int k) {
        // First find initial window
        int sum = 0;
        Arrays.sort(nums);
        for(int i =0; i<nums.length-k+1; i++){
           if(sum == 0) {
               sum = nums[i + k - 1] - nums[i];
           }else{
               sum = Math.min(sum, nums[i + k - 1] - nums[i]);
           }
        }
        return sum;
    }


}
