package com.rajkhare.lambda.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Exercise4 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(incrementList(numbers, 3));
    }

    public static List<Integer> incrementList(List<Integer> numbers, int incrementValue) {
        // Define a lambda expression using the UnaryOperator functional interface
        UnaryOperator<Integer> incrementedValue = num -> num + incrementValue;

        // Apply the lambda expression to each integer in the list
        List<Integer> incrementedNumList = filter(numbers, incrementedValue);

        return incrementedNumList;
    }

    public static List<Integer> filter(List<Integer> numbers, UnaryOperator<Integer> incrementedValue){
        List<Integer> incrementedNumList = new ArrayList<>();
        for (Integer number : numbers) {
            incrementedNumList.add(incrementedValue.apply(number));
        }

        return incrementedNumList;
    }

}
