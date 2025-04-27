package com.rajkhare.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamLimitOperationDemo {

    public static void main(String[] args) {
        Stream.generate(new Random()::nextInt)
                .map(num -> num * 2)
                .limit(10)
                .forEach(System.out::println);
    }

}
