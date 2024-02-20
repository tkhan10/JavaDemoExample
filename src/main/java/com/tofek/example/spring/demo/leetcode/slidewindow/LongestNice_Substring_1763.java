package com.tofek.example.spring.demo.leetcode.slidewindow;

/**
 * Brute force
 */

/**
 * A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.
 *
 * Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "YazaAay"
 * Output: "aAa"
 * Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
 * "aAa" is the longest nice substring.
 * Example 2:
 *
 * Input: s = "Bb"
 * Output: "Bb"
 * Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.
 * Example 3:
 *
 * Input: s = "c"
 * Output: ""
 * Explanation: There are no nice substrings.
 */
public class LongestNice_Substring_1763 {
    public static void main(String[] args) {
        String input = "YazaAay";
        //String input = "Bb";

        System.out.println(longestNiceSubstring(input));
        //isNice("aAa");

    }

    private static String longestNiceSubstring(String input) {
        if(input.length() ==1)
            return "";
        String finalString = "";
        for(int i = 0; i<input.length(); i++){
            for(int j =i; j<=input.length(); j++){
                String str = input.substring(i, j);
                if(isNice(str)){
                   if(finalString.length()<str.length()){
                       finalString = str;
                   }
                }

            }
        }
        return finalString;
    }

    private static boolean isNice(String str) {
        char[] charArray = str.toCharArray();
        for(int i = 0; i<str.length(); i++){
            if(str.contains(String.valueOf(charArray[i]).toUpperCase()) &&
                    str.contains(String.valueOf(charArray[i]).toLowerCase())){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
