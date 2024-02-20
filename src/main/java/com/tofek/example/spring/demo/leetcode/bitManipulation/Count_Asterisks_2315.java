package com.tofek.example.spring.demo.leetcode.bitManipulation;

import org.springframework.util.StringUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Count_Asterisks_2315 {

    public static void main(String[] args) {
        countAsterisks();
    }

    public static void countAsterisks(){
        String s = "l|*e*et|c**o|*de|";
        int c = StringUtils.countOccurrencesOf(s, "|");
        String[] str = s.split("\\|");
        int count = 0;
        for(int i=0; i<str.length;){
            count = count+countGivenString(str[i], "*");
            i = i+2;
        }
        System.out.println(count);
    }

    private static int countGivenString(String s, String c) {
        int ccc = 0;
        char[] charString = s.toCharArray();
        for(int i = 0; i<charString.length; i++){
            if(c.equalsIgnoreCase(String.valueOf(charString[i]))){
                ccc++;
            }
        }
        return ccc;
    }
}
