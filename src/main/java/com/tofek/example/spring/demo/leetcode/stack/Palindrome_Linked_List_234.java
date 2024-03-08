package com.tofek.example.spring.demo.leetcode.stack;

import java.util.Stack;

public class Palindrome_Linked_List_234 {
    public static void main(String[] args) {
        ListNode head = new ListNode();

        //ListNode node4 = new ListNode(1, null);
        //ListNode node3 = new ListNode(2, node4);
        //ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, null);
        head = node1;


        System.out.println(palindromeLinkedList(head));
    }

    private static boolean palindromeLinkedList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            if(stack.isEmpty()){
                stack.push(head.val);
            }else if(stack.peek() == head.val){
                stack.pop();
            }else{
                stack.push(head.val);
            }

            head = head.next ;

        }

        return (stack.isEmpty() || stack.size()==1) ?true:false;
    }
}

