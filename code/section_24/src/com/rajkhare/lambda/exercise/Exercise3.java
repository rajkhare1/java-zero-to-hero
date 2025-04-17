package com.rajkhare.lambda.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Exercise3 {

    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world", "java", "lambda");
        System.out.println(transformStringLengths(strings));
    }

    public static List<Integer> transformStringLengths(List<String> strings) {

        // Define a lambda expression using the Function functional interface
        Function<String, Integer> lengthOfString = input -> input.length();


        // Apply the lambda expression to each string in the list
        List<Integer> strLengthList = filter(strings, lengthOfString);

        return  strLengthList;

    }

    public static List<Integer> filter(List<String> strings, Function<String,Integer> function){
        List<Integer> strLengthList = new ArrayList<>();
        for (String string : strings) {
            strLengthList.add(function.apply(string));
        }

        return strLengthList;
    }

}
