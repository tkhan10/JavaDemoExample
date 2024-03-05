package com.tofek.example.spring.demo.leetcode.slidewindow;

public class Maximum_Average_Subarray_I_643 {

    public static void main(String[] args) {
        //int[] nums = new int[]{1,12,-5,-6,50,3}; int k = 4;
        //int[] nums = new int[]{5}; int k = 1;
        //int[] nums = new int[]{-1}; int k = 1;
        int[] nums = new int[]{3,3,4,3,0}; int k = 3;

        //System.out.println(maximumAverageSubarrayBruteForce(nums, k));
        System.out.println(maximumAverageSubarraySlidingWindow(nums, k));
    }

    private static double maximumAverageSubarraySlidingWindow(int[] nums, int k) {
        double max = 0;
        double window = 0;
        // First find the first window and its calculation
        if(nums.length==1){
            return nums[0];
        }
        for(int i =0; i<k; i++){
            window = window+nums[i];
        }
        max = window/k;

        for(int j = k; j<nums.length; j++){
            window = window + nums[j] - nums[j-k];
            max = Math.max(max, window/k);
        }
        return max;
    }

    private static double maximumAverageSubarrayBruteForce(int[] nums, int k) {
        int start = 0;
        int end = k;
        double sum = 0;
        double max = 0;
        for(int i = 0; i<nums.length-k+1; i++){
            for(int j = start; j<end; j++){
                sum = (sum+nums[j]);
            }
            sum = sum/k;
            if((sum>0 && max<sum) || (sum<0 && max>sum)){
                max = sum;
            }
            start++;
            end++;
            sum = 0;
        }
        return max;
    }
}
