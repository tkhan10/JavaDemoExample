package com.tofek.example.spring.demo.leetcode.bitManipulation;

public class DecodeTheMessage2325 {

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String secrets = "abcdefghijklmnopqrstuvwxyz";

        key = key.toLowerCase().replaceAll(" ","");

        char[] charArray = key.toCharArray();
        StringBuilder result = new StringBuilder("");
        for(char ch : message.toCharArray()){
            if(" ".equalsIgnoreCase(String.valueOf(ch))){
                result = result.append(" ");
            }
            int charInt = (int) ch-96;
            char c = charArray[(int) ch-96];
            result.append(String.valueOf(key.charAt((int) c-96)));
        }
        System.out.println(result);
    }
}
