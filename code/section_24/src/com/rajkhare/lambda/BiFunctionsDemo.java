package com.rajkhare.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionsDemo {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven = (num1, num2) -> (num1 + num2) % 2 == 0;
        System.out.println(isSumEven.test(4,9));// false

        // 2,3->8, 5,2->25
        BiFunction<Double, Double, Double> calculatePower = (num1, num2) -> Math.pow(num1,num2);
        System.out.println(calculatePower.apply(2.0,3.0));

        BiConsumer<String, String> appendAndPrintInUppercase = (str1, str2) -> System.out.println((str1+str2).toUpperCase());
        appendAndPrintInUppercase.accept("Hello ","Lambda Expressions");

        BiConsumer<String, String> appendAndPrintLength = (str1, str2) -> System.out.println((str1+str2).length());
        appendAndPrintLength.accept("Raj ","Khare");

        BinaryOperator<Double> calculatePowerWithBO = (num1, num2) -> Math.pow(num1,num2);
        System.out.println(calculatePowerWithBO.apply(5.0,2.0));

        BinaryOperator<Integer> maxOperation = BinaryOperator.maxBy((a,b) -> Integer.compare(a,b));
        System.out.println(maxOperation.apply(16,30));

        BinaryOperator<Integer> minOperation = BinaryOperator.minBy(((a,b) -> Integer.compare(a,b)));
        System.out.println(minOperation.apply(16,30));
    }

}
