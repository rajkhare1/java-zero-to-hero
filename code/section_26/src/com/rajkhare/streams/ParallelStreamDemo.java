package com.rajkhare.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamDemo {

    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(1, num -> num + 1).limit(100);

        System.out.println(numStream.map(num -> num * 2).collect(Collectors.toList()));
    }

}
