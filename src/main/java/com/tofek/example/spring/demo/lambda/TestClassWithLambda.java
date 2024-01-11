package com.tofek.example.spring.demo.lambda;


interface TestInterface{
    public int addition(int a, int b);
}
public class TestClassWithLambda{

    public static void main(String[] args) {
        TestInterface t = (a, b) -> {
            if(b>a){
                return b-a;
            }else{
                return 0;
            }
        };
        System.out.println(t.addition(19, 13));
    }

}
