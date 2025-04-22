package com.rajkhare.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo {

    public static void main(String[] args) {
        var departmentList = new ArrayList<String>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        // creating streams from collection object - approach 1
        Stream<String> depStream = departmentList.stream();
//        depStream.parallel();// will convert normal stream to parallel stream

        // iterate the collection
        depStream.forEach(System.out::println);

        System.out.println("-----------------------------------");

        // creating streams directly from Stream<T> class - approach 2
        Stream<String> inputStream = Stream.of("Raj", "Khare", "Java");

        // iterate stream
        inputStream.forEach(System.out::println);

        System.out.println("-----------------------------------");

        // parallel stream to utilize the all cores of your laptop/server
        Stream<String> parallelStream = departmentList.parallelStream();
        parallelStream.forEach(System.out::println);// but order can be different

        System.out.println("-----------------------------------");

        // how to create a Stream object from the Array object
        String[] arrayOfWords = {"Raj", "Khare"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        // all the filtered elements can be transferred into empty stream
        Stream<String> empty = Stream.empty();

        // To generate the infinite Stream:
//        Stream.generate(new Random()::nextInt).forEach(System.out::println);// approach 1
        Stream.iterate(1, n -> n+1).forEach(System.out::println);// approach 2

    }

}
