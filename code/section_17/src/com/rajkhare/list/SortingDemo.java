package com.rajkhare.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class SortingDemo {

    private static Logger logger = Logger.getLogger(SortingDemo.class.getName());

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // adding elements to the ArrayList
        numbers.add(47);
        numbers.add(43);
        numbers.add(67);
        numbers.add(92);
        numbers.add(3);
        numbers.add(-67);
        numbers.add(-2);
        numbers.add(0);
        logger.info(""+numbers);
        Collections.sort(numbers);
        logger.info(""+numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        logger.info(""+numbers);

        var countries = new ArrayList<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("France");
        countries.add("Canada");
        logger.info(""+countries);
//        Collections.sort(countries);
        countries.sort(Comparator.naturalOrder());
        logger.info(""+countries);
//        Collections.sort(countries, Comparator.reverseOrder());
        countries.sort(Comparator.reverseOrder());
        logger.info(""+countries);

        var countries1 = new ArrayList<String>();
        countries1.add("India");
        countries1.add("USA");
        countries1.add("Japan");
        countries1.add("France");
        countries1.add("Canada");
//        countries1.sort(new LastCharComparator());
        Collections.sort(countries1, new LastCharComparator());
        logger.info(""+countries1);
    }

}
