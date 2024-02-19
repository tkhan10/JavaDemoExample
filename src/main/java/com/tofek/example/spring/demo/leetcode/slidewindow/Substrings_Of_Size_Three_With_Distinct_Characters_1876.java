package com.tofek.example.spring.demo.leetcode.slidewindow;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Substrings_Of_Size_Three_With_Distinct_Characters_1876 {

    public static void main(String[] args) {
        String input = "aababcabc";
        int k = 3;
        System.out.println(substringsOfSizeThreeWithDistinctCharacters(input, k));
    }

    private static int substringsOfSizeThreeWithDistinctCharacters(String s, int k) {
        int start = 0;
        int end = k;
        int count =0;
        while(start<s.length()-k+1){
           String str =  s.substring(start, end);
           if(isGoodString(str))
               count++;
           start++; end++;
        }
        return count;
    }

    private static boolean isGoodString(String s){
        char[] charArray = s.toCharArray();
        Set<Character> charSet = new HashSet<>();
        boolean isGood = true;
        for(char c : charArray){
            if(!charSet.add(c)){
                isGood = false;
                break;
            }
        }
        return isGood;
    }
}
