package com.tofek.example.spring.demo.functionainterface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{

    public static void main(String[] args) {

        /*Consumer consumer = integer ->
            System.out.println("Integer -- " + integer);
        consumer.accept(10);*/

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().forEach(integer ->
                System.out.println("Integer -- " + integer));
    }
}
