package com.tofek.example.spring.demo.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findFaultyKeyboard {

    public static void main(String[] args) {
        String input = "string";
        findFaultyKeyboard_String(input);
    }

    public static void findFaultyKeyboard_String(String input){
        char[] charArray = input.toCharArray();
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<charArray.length; i++){
            if("i".equalsIgnoreCase(String.valueOf(charArray[i]))){
                str.reverse();
            }else{
                str = str.append(String.valueOf(charArray[i]));
            }
        }
        System.out.println(str.toString());
    }
}


