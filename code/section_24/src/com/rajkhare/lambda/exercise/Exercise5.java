package com.rajkhare.lambda.exercise;

import java.util.List;
import java.util.function.Consumer;

public class Exercise5 {

    public static void main(String[] args) {
        List<String> inputString = List.of("apple", "banana", "carrot");
        convertAndPrint(inputString);
    }

    public static void convertAndPrint(List<String> inputString) {
        Consumer<String> convertIntoUpperCase = input -> System.out.println(input.toUpperCase());
        inputString.forEach(convertIntoUpperCase);
    }

}
