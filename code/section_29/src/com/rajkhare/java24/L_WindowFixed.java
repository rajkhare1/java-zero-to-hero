package com.rajkhare.java24;

import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class L_WindowFixed {

    public static void main(String[] args) {
        List<List<Integer>> output = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .gather(Gatherers.windowFixed(2))
                .toList();

        System.out.println(output);// [[1, 2], [3, 4], [5, 6], [7, 8]]
    }

}
