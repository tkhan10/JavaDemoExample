package com.tofek.example.spring.demo.leetcode.slidewindow;

public class Maximum_Strong_Pair_XOR_I_2932 {

    public static void main(String[] args) {

        int[] input = new int[]{5,6,25,30};
        System.out.println(maximumStrongPairXORI(input));
    }

    /**
     * This method is brute force and its time complexity is n*n
     * @param nums
     * @return
     */
    private static int maximumStrongPairXORI(int[] nums) {
        int largeSum = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    sum = nums[i]^nums[j];
                    if(largeSum<sum){
                        largeSum = sum;
                    }
                }
            }
        }

        return largeSum;
    }
}
