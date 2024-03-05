package com.tofek.example.spring.demo.leetcode.stack;

import java.util.Stack;

public class Valid_Parentheses_20 {
    public static void main(String[] args) {
        //String s = "()[]{}";
        //String s = "([{)}]";
        //String s = "[";
        String s = "]";

        System.out.println(validParentheses(s));
    }

    private static boolean validParentheses(String s) {
        Stack<Character> stringStack = new Stack<>();

        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == '('  ||c == '['  || c == '{' ){
                stringStack.push(c);
            }else if (c == ')'){
                if(!stringStack.isEmpty() &&'(' == stringStack.peek()){
                    stringStack.pop();
                }else{
                    return false;
                }
            }else if (c == ']' ){
                if( !stringStack.isEmpty() && '[' == stringStack.peek()){
                    stringStack.pop();
                }else{
                    return false;
                }
            }else if (c == '}'){
                if(!stringStack.isEmpty() && '{' == stringStack.peek()){
                    stringStack.pop();
                }else{
                    return false;
                }
            }
        }
        return (stringStack.isEmpty())?true:false;
    }
}
