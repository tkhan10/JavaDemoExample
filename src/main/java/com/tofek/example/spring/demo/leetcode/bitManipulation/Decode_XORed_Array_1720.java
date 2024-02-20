package com.tofek.example.spring.demo.leetcode.bitManipulation;

public class Decode_XORed_Array_1720 {
    /**
     * There is a hidden integer array arr that consists of n non-negative integers.
     * It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].
     * You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].
     * Return the original array arr. It can be proved that the answer exists and is unique.
     *
     * Example 1:
     *
     * Input: encoded = [1,2,3], first = 1
     * Output: [1,0,2,1]
     * Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
     * Example 2:
     *
     * Input: encoded = [6,2,7,3], first = 4
     * Output: [4,2,0,7,4]
     * @param args
     */
    public static void main(String[] args) {
        int[] encoded = new int[]{1,2,3};
        int first = 1;
        System.out.println(decode(encoded,first));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] code = new int[encoded.length+1];
        code[0] = first;
        for(int i=0; i<encoded.length; i++){
            code[i+1] = encoded[i]^code[i]; //
        }
        return code;

    }
}
