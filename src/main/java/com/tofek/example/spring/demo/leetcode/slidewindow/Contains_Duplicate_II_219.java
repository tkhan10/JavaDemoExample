package com.tofek.example.spring.demo.leetcode.slidewindow;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_II_219 {

    public static void main(String[] args) {
        /*int[] nums = {1,2,3,1};
        int k =3;    // output = true*/
        int[] nums = {1,2,3,1,2,3};  // output = false
        int k =2;  // output = true
        /*int[] nums = {1,0,1,1};
        int k =1; // output true*/

        //System.out.println(containsDuplicateII(nums, k));
        System.out.println(containsDuplicateIIUsingHashSet(nums, k));
    }

    private static boolean containsDuplicateII(int[] nums, int k) {

        for(int i =0; i<nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean containsDuplicateIIUsingHashSet(int[] nums, int k) {
        if(nums == null || nums.length < 2 || k == 0)
            return false;
        int j = 0;
        Set<Integer> integerSet = new HashSet<>();
        for(int i =0; i<nums.length; i++){
            if(!integerSet.add(nums[i])){
                return true;
            }

            if(integerSet.size() >=k+1){
                integerSet.remove(nums[j++]);
            }
        }
        return false;
    }
}
