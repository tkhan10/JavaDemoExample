package com.tofek.example.spring.demo.leetcode.stack;

public class Maximum_Nesting_Depth_Of_The_Parentheses_1614 {
    public static void main(String[] args) {
        //String s = "(1+(2*3)+((8)/4))+1";
        String s = "(1)+((2))+(((3)))";

        System.out.println(maximumNestingDepthOfTheParentheses(s));

    }

    private static int maximumNestingDepthOfTheParentheses(String s) {
        int leftParen = 0;
        int rightParen = 0;
        int max = 0;
        for(int i = 0;  i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                leftParen++;
            }else if(c == ')') {
                rightParen++;
            }
            max = Math.max(max, (leftParen - rightParen));
        }
        return max;
    }
}
