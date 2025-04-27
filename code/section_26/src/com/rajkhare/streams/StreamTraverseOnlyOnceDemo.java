package com.rajkhare.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTraverseOnlyOnceDemo {

    public static void main(String[] args) {
        var departmentList = new ArrayList<String>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        Stream<String> deptStream = departmentList.stream();
        deptStream.forEach(System.out::println);
        deptStream.forEach(System.out::println);// java.lang.IllegalStateException: stream has already been operated upon or closed
    }

}
