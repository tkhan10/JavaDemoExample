package com.tofek.example.spring.demo.leetcode.stack;

import java.util.Stack;
import java.util.stream.Collectors;

public class Backspace_String_Compare_844 {

    public static void main(String[] args) {
        //String s = "ab#c"; String t = "ad#c";
        //String s = "ab##"; String t = "c#d#";
        String s = "y#fo##f"; String t = "y#f#o##f";

        System.out.println(backspaceStringCompare(s, t));

    }
    private static boolean backspaceStringCompare(String s, String t) {
        return getStringAftarProcessing(s).equalsIgnoreCase(getStringAftarProcessing(t));
    }

    private static String getStringAftarProcessing(String input){
        Stack<Character> sStack =  new Stack<>();
        for(int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            if(!"#".equalsIgnoreCase(String.valueOf(c)) && sStack.isEmpty()){
                sStack.push(c);
            }else if(sStack.size()>0 && "#".equalsIgnoreCase(String.valueOf(c))){
                sStack.pop();
            }else if(!"#".equalsIgnoreCase(String.valueOf(c))){
                sStack.push(c);
            }
        }
        return sStack.stream().map(a->a.toString()).collect(Collectors.joining(""));

    }
}
