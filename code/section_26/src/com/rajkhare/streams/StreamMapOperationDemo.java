package com.rajkhare.streams;

import java.util.ArrayList;

public class StreamMapOperationDemo {

    public static void main(String[] args) {
        // Source
        var departmentList = new ArrayList<String>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        // Stream Pipeline
        departmentList.stream()// Stage 1: create a stream object
                .map(word -> word.toUpperCase())// Stage 2: one or more Intermediate Operation (business logic)
                .forEach(System.out::println);// State 3: Terminal Operation (produce result)

        // Stream Pipeline
        departmentList.stream()// Stage 1: create a stream object
                .map(word -> word.toUpperCase())// Stage 2: one or more Intermediate Operation (business logic)
                .map(word -> "Hi "+word)// Stage 2: one or more Intermediate Operation (business logic)
                .forEach(System.out::println);// State 3: Terminal Operation (produce result)


    }

}
