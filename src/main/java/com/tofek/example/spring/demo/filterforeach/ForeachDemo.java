package com.tofek.example.spring.demo.filterforeach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachDemo {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        intList.stream().forEach(t-> System.out.println(t));

        //Consumer functional interface which has only 1 method and that accept 1 elemenet and return nothing


    }
}
