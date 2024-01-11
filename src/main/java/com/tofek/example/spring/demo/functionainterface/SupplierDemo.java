package com.tofek.example.spring.demo.functionainterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {



    public static void main(String[] args) {
        Supplier supp = () -> "Inside get method";
        System.out.println(supp.get());

        List<String> listInt = Arrays.asList("test","apple","Cat","Dog", "heavy");
        String result = listInt.stream().filter(t->t.equalsIgnoreCase("Camel")).findAny().orElseGet(supp);
        System.out.println("Result - "+result);
    }


}
