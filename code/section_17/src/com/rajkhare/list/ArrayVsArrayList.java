package com.rajkhare.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class ArrayVsArrayList {

    private static Logger logger = Logger.getLogger(ArrayVsArrayList.class.getName());

    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        // convert ArrayList to Array
        String[] countries = countryNames.toArray(new String[countryNames.size()]);
        logger.info(Arrays.toString(countries));

        // convert Array to ArrayList
        List<String> newList = Arrays.asList(countries);
        logger.info(""+newList);
    }

}
