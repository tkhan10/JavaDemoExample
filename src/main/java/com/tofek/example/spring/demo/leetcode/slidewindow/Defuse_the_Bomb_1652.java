package com.tofek.example.spring.demo.leetcode.slidewindow;

public class Defuse_the_Bomb_1652 {

    public static void main(String[] args) {
        //int[] input = new int[]{5,7,1,4}; int k = 3;
        //int[] input = new int[]{2,4,9,3}; int k = -2;
        int[] input = new int[]{5,7,1,4}; int k = 0;
        System.out.println(defuseTheBomb(input, k));
    }

    static int[] defuseTheBomb(int[] input, int k) {
        int[] result = new int[input.length];
        int len = input.length;
        if(k==0){
            for(int i =0; i<input.length;i++){
                result[i] = 0;
            }
        }else if( k > 0){
                for(int i =0; i<input.length;i++){
                    for(int j = 1; j<=k; j++){
                       result[i] = result[i]+input[(i+j)% len];
                    }
                }
        }else {
            for(int i =0; i<input.length;i++){
                for(int j = -1; j>=k; j--){
                    int index= (i+j)%len;
                    if(index<0){
                        index = index+len;
                    }
                    result[i] = result[i]+input[index];
                }
            }
        }
        return result;
    }
}
