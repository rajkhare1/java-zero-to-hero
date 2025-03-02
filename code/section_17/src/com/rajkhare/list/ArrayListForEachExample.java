package com.rajkhare.list;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ArrayListForEachExample {

    private static Logger logger = Logger.getLogger(ArrayListForEachExample.class.getName());

    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();

        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        for(String country:countryNames){
            logger.info(country);
        }

    }

}
