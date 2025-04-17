package com.rajkhare.lambda;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String, String> convertStr = input -> input.toUpperCase();
        System.out.println(convertStr.apply("raj khare"));// RAJ KHARE

        Function<String, Integer> getStrLength = input -> input.length();
        System.out.println(getStrLength.apply("Raj Khare"));// 9

        // Static method identity() for same output as input
        Function<String, String> identity = Function.identity();
        System.out.println(identity.apply("Hi Raj Khare"));// Hi Raj Khare

        // default methods for chaining multiple lambda expressions
        Function<Integer, Integer> doubleValue  = num -> num * 2;
        Function<Integer, Integer> addThree  = num -> num + 3;
        Function<Integer, Integer> output1 = doubleValue.andThen(addThree);
        Function<Integer, Integer> output2 = doubleValue.compose(addThree);
        System.out.println(output1.apply(5));// 13
        System.out.println(output2.apply(5));// 16
    }

}
