package com.tofek.example.spring.demo.leetcode.stack;

import java.util.Stack;

public class Remove_Outermost_Parentheses_1021 {

    public static void main(String[] args) {
        //Input:
        //String s = "(()())(())";
        String s = "(()())(())(()(()))";

        System.out.println(removeOutermostParentheses(s));
    }

    private static String removeOutermostParentheses(String s) {
        Stack<Character> characterStack = new Stack<>();
        StringBuilder result = new StringBuilder("");

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if("(".equalsIgnoreCase(String.valueOf(c))){
                characterStack.push(c);
            }else if(")".equalsIgnoreCase(String.valueOf(c))){
                characterStack.pop();
                if(characterStack.size()>0)
                        result.append("()");
            }
        }
        return result.toString();
    }
}
