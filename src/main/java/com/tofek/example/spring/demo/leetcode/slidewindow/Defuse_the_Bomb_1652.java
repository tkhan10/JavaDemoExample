package com.tofek.example.spring.demo.leetcode.slidewindow;

public interface Defuse_the_Bomb_1652 {

    public static void main(String[] args) {
        int[] input = new int[]{5,7,1,4};
        int k = 3;
        defuseTheBomb(input, k);
    }

    static void defuseTheBomb(int[] input, int k) {
        int[] result = new int[input.length];
        if(k>0){
            for(int i =0; i<input.length-1;i++){
                result[i] = input[i+1];
            }
        }
    }
}
