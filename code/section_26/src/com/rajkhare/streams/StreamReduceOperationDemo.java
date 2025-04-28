package com.rajkhare.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class StreamReduceOperationDemo {

    public static void main(String[] args) {
        var departmentList = new ArrayList<String>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");
        System.out.println(departmentList.stream().count());// 4

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);// 15

        // invoking the specialized reduce operation(sum,max,min)
        OptionalInt result = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num)
                .max();
        System.out.println(result.getAsInt());// 4
    }

}
