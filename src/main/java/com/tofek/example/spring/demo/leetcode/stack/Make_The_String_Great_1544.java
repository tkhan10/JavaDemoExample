package com.tofek.example.spring.demo.leetcode.stack;

import org.springframework.util.StringUtils;

import java.util.Stack;
import java.util.stream.Collectors;

public class Make_The_String_Great_1544 {
    public static void main(String[] args) {

        //String s = "leEeetcode";
        //String s = "abBAcC";
        String s = "mC";
        //System.out.println((int)'D'-(int)'d');
        System.out.println(makeTheStringGreat(s));
    }

    private static String makeTheStringGreat(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.isBlank() || s.isEmpty()){
            return s;
        }
        stack.push(s.charAt(0));
        for(int i = 1; i<s.length();i++){
            char c = s.charAt(i);
            int chatAscii = (int)s.charAt(i);
            int peekAscii = (stack.size()>0)?(int)stack.peek():0;
            if(Math.abs(chatAscii-peekAscii)==32){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.stream().map(a->a.toString()).collect(Collectors.joining(""));
    }
}
