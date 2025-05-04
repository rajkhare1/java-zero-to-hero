package com.rajkhare.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamAPINullCheckTip {

    public static void main(String[] args) {
        List<String> countryNames = Arrays.asList("USA", "India", null, "Canada", null, "UK", null, null, "Germany");
        List<String> countryNamesInUppercase = countryNames.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(countryNamesInUppercase);
    }

}
