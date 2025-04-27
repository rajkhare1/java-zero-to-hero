package com.rajkhare.streams;

import java.util.ArrayList;

public class StreamFilterOperationDemo {

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
                .filter(word -> word.startsWith("S"))// Stage 2: one or more Intermediate Operation (business logic)
                .forEach(System.out::println);// State 3: Terminal Operation (produce result)




    }

}
