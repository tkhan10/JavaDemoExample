package com.tofek.example.spring.demo.leetcode.bitManipulation;

import java.util.HashSet;
import java.util.Set;

public class Set_Mismatch_645 {

    public static void main(String[] args) {
        int[] input = new int[]{2,3,4,5,3,6};
        System.out.println(setMismatchNumber(input));
    }

    private static int[] setMismatchNumber(int[] input) {
        int[] result = new int[2];
        Set<Integer> setNumber = new HashSet<>();
        for(int a : input){
            if(!setNumber.add(a)){
                result[0] = a;
                result[1] = a+1;
                System.out.println(a);
            }
        }
        return result;
    }

}

