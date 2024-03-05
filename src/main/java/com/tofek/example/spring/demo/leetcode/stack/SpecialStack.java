package com.tofek.example.spring.demo.leetcode.stack;

import ch.qos.logback.core.status.OnConsoleStatusListener;

import java.util.Stack;

/**
 * Design a special Stack which support getMin() operation along with its own operations.
 * And this implementation should be used only Stack operations.
 */
public class SpecialStack {
    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(18);
        originalStack.push(19);
        originalStack.push(29);
        originalStack.push(10);
        originalStack.push(16);

        //System.out.println(getMinUsingAnotherStack(originalStack));
        System.out.println(getMinUsingIntVariable(originalStack));
    }

    private static Integer getMinUsingIntVariable(Stack<Integer> originalStack) {
        int min = -1;
        for(int i =0; i<originalStack.size(); i++){
            Integer data = originalStack.peek();
            if(min == -1){
                min = data;
                //originalStack.pop();
            }else if(min>data){
                min = data;
            }
            originalStack.pop();
        }

        return min;
    }

    private static Integer getMinUsingAnotherStack(Stack<Integer> originalStack) {
        Stack<Integer> auxiliaryStack = new Stack<>();
        for(int i =0; i<originalStack.size(); i++){
            Integer data = originalStack.peek();
            if(auxiliaryStack.isEmpty()){
                auxiliaryStack.push(data);
            } else if(data<=auxiliaryStack.peek()){
                int element = originalStack.peek();
                auxiliaryStack.pop();
                auxiliaryStack.push(element);
                originalStack.pop();
            }else {
                originalStack.pop();
            }
        }

        return auxiliaryStack.peek();
    }


}
