package com.tofek.example.spring.demo.sortalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListServiceDemo {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(4);
        intList.add(6);
        intList.add(7);
        intList.add(16);

        Collections.sort(intList);
        System.out.println("First Case - "+intList);

        Collections.reverse(intList);
        System.out.println("Reverse Order - "+intList);
        System.out.println("============== Latest way =================");

        System.out.println("First Case Order - ");
        intList.stream().sorted().forEach(s-> System.out.print(s));
        System.out.println("\nSecond Case Order - ");
        intList.stream().sorted((t1, t2)->t2.compareTo(t1)).forEach(s->System.out.print(s));

        System.out.println("\n============== The End =================");




    }



}
