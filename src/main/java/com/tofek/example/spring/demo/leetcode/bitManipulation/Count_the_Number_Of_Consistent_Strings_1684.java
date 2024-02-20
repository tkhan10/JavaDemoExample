package com.tofek.example.spring.demo.leetcode.bitManipulation;

import java.util.HashSet;
import java.util.Set;

public class Count_the_Number_Of_Consistent_Strings_1684 {

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        System.out.println(countTheNumberOfConsistentStrings(allowed, words));
    }

    private static int countTheNumberOfConsistentStrings(String allowed, String[] words) {
        int consistent = 0;
        Set<Character> charSet = new HashSet<>();
        for(char c : allowed.toCharArray())
            charSet.add(c);

        for(String word : words){
            boolean status = true;
            char[] wordChar = word.toCharArray();
            for(char ch : wordChar){
                if(!charSet.contains(ch)){
                    status=false;
                    break;
                }
            }

            if(status){
                consistent++;
            }
        }
        return consistent;
    }
}
