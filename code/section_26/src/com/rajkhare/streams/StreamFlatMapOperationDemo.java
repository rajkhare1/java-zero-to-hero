package com.rajkhare.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapOperationDemo {

    public static void main(String[] args) {
        String[] arrayOfWords = {"Raj", "Khare"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
        Stream<String[]> streamOfLetters = streamOfWords.map(word -> word.split(""));
//        streamOfLetters.forEach(System.out::println);// Problem: [Ljava.lang.String;@32e6e9c3
        streamOfLetters.flatMap(Arrays::stream).forEach(System.out::println);

        List<Person> persons = Arrays.asList(new Person("Alice", Arrays.asList("123", "456")), new Person("Bob", Arrays.asList("789", "101", "112")));

        List<List<String>> mapResult = persons.stream().map(Person::getPhoneNumbers).collect(Collectors.toList());

        System.out.println(mapResult);// [[123, 456], [789, 101, 112]] not in decent format

        // using flat map
        List<String> flatMapResult = persons.stream().flatMap(person -> person.getPhoneNumbers().stream()).collect(Collectors.toList());

        System.out.println(flatMapResult);// [123, 456, 789, 101, 112]


    }

}
