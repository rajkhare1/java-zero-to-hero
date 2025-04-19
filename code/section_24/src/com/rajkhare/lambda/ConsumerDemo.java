package com.rajkhare.lambda;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());
        convertAndDisplay.accept("Raj Khare");

        Consumer<Integer> squareOf = input -> System.out.println(input * input);
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbersList.forEach(squareOf);

        // demo of default method inside Consumer<T>
        Consumer<String> appendInput = input -> System.out.println("New value after appending the input is : HELLO "+input);
        appendInput.andThen(convertAndDisplay).accept("Lambda Expression");
    }

}
