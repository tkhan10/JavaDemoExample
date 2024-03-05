package com.tofek.example.spring.demo.leetcode.slidewindow;

public class Find_KBeauty_Of_Number_2269 {

    public static void main(String[] args) {
        int num = 430043;
        int k =2;
        System.out.println(findKBeautyOfNumber(num, k));
    }

    private static int findKBeautyOfNumber(int num, int k) {
        String s = String.valueOf(num);
        int start = 0;
        int end = k;
        int count = 0;
        while(end<=s.length()) {
            String sub = s.substring(start, end);
            int subInt = Integer.valueOf(sub);
            if (subInt > 0 && num % subInt == 0) {
                count++;
            }
            start++; end++;
        }
        return count;

    }
}
