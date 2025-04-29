package com.rajkhare.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectOperationDemo {

    public static void main(String[] args) {
        var departmentList = new ArrayList<String>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        List<String> newDepartmentList = departmentList.stream()
                .filter(word -> word.startsWith("S"))
                .collect(Collectors.toList());

        newDepartmentList.forEach(System.out::println);

        Long totalCount = departmentList.stream()
                .filter(word -> word.startsWith("S"))
                .collect(Collectors.counting());
        System.out.println(totalCount);

        Set<String> newDepartmentSet = departmentList.stream()
                .filter(word -> word.startsWith("S"))
                .collect(Collectors.toCollection(TreeSet::new));
    }

}
