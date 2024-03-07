package com.tofek.example.spring.demo.leetcode.stack;

import java.util.Stack;
import java.util.stream.Collectors;

public class Remove_All_Adjacent_Duplicates_In_String_1047 {

    public static void main(String[] args) {
        String s = "abbaca";

        System.out.println(removeAllAdjacentDuplicatesInString(s));
    }

    private static String removeAllAdjacentDuplicatesInString(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i = 1; i<s.length(); i++){
            char c = s.charAt(i);
            if(stack.size()>0 && stack.peek().equals(c)){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.stream().map(a->a.toString()).collect(Collectors.joining(""));
    }
}
