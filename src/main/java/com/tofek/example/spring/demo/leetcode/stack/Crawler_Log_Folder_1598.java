package com.tofek.example.spring.demo.leetcode.stack;

import java.util.ArrayList;
import java.util.Stack;

public class Crawler_Log_Folder_1598 {

    public static void main(String[] args) {
        //String[] logs = new String[]{"d1/","d2/","../","d21/","./"};
        //String[] logs = new String[]{"d1/","d2/","./","d3/","../","d31/"};
        //String[] logs = new String[]{"d1/","../","../","../"};
        String[] logs = new String[]{"./","../","./"};

        System.out.println(crawlerLogFolder(logs));
    }

    private static int crawlerLogFolder(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(String str : logs){
            if(str.equalsIgnoreCase("../") && stack.size()>0){
                stack.pop();
            }else if(str.equalsIgnoreCase("./")&& stack.size()>0){
                stack.peek();
            }else if(!str.equalsIgnoreCase("../") && !str.equalsIgnoreCase("./")){
                stack.push(str.substring(0, str.length()-1));
            }
        }
        return stack.size();
    }
}
