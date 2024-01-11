package com.tofek.example.spring.demo.functionainterface;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {
public static void main(String[] args) {
        /*Predicate<Integer> p = (t) -> (t % 2 == 0)? true:false;
        System.out.println(p.test(11 ));*/

        List<Integer> listInt = Arrays.asList(1,2,3,4,5,7);
        listInt.stream().filter(t->t%2==0).forEach(t-> System.out.println("Print Even "+t));
    }
}
