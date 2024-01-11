package com.tofek.example.spring.demo.filterforeach;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        intList.stream().filter(t->t%2==0).forEach(t-> System.out.println(t));

        //Consumer functional interface which has only 1 method and that accept 1 elemenet and return nothing


    }
}
