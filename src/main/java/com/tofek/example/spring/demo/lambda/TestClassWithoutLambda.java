package com.tofek.example.spring.demo.lambda;

interface Calculator{
    int substract(int a, int b);
}
public class TestClassWithoutLambda implements Calculator{
    @Override
    public int substract(int a, int b) {
        return b-a;
    }

    public static void main(String[] args) {
        TestClassWithoutLambda testClass = new TestClassWithoutLambda();
        int res = testClass.substract(8, 20);
        System.out.println(res);
    }
}
