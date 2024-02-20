package com.tofek.example.spring.demo.leetcode.bitManipulation;

public class XOR_Operation_in_Array_1486 {

    public static void main(String[] args) {
        int n = 4;
        int start = 3;
        System.out.println(findResultArray(n, start));
    }

    static int findResultArray(int n, int start) {
        int result = start;
        int[] code = new int[n];
        for (int i = 1; i < n ; i++) {
            code[i] = start + 2*i;
            result = result^code[i];
        }
        return result;
    }
}
