package com.tofek.example.spring.demo.leetcode.bitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CountPairsWhoseSumIslessThanTarget {

    public static void main(String[] args) {
        int target= -2;
        //List<Integer> nums = Arrays.asList(-1,1,2,3,1);
        List<Integer> nums = Arrays.asList(-6,2,5,-2,-7,-1,3);
        System.out.println(countPairs(nums, target));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        Object[] numsInt = nums.toArray();

        for(int i=0; i<numsInt.length;i++){
            for(int j=i+1; j<numsInt.length-i;j++){
                if((Integer.parseInt(numsInt[i].toString())+Integer.parseInt(numsInt[j].toString())) < target){
                    count++;
                }
            }
        }
        return count;
    }
}
