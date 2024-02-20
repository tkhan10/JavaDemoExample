package com.tofek.example.spring.demo.leetcode.bitManipulation;

public class Number_Steps_Reduce_Number_TO_Zero_1342 {
    /**
     * Given an integer num, return the number of steps to reduce it to zero.
     *
     * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
     * @param args
     */
    public static void main(String[] args) {
        int n = 8;
        System.out.println(numberOfStepsReduceToZero(n));
    }

    private static int numberOfStepsReduceToZero(int n) {
        int steps = 0;
        while(n>0){
            if(n%2 == 0){
                n = n/2;
            }else{
                n = n-1;
            }
            steps++;
        }
        return steps;
    }
}
