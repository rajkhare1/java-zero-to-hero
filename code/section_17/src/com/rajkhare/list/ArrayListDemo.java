package com.rajkhare.list;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ArrayListDemo {

    private static Logger logger = Logger.getLogger(ArrayListDemo.class.getName());

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        List<Character> characters = new ArrayList<Character>();
        var doubleNums = new ArrayList<Double>();
        List<String> countryNames = new ArrayList<String>();
        logger.info(""+countryNames.size());
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");
        logger.info(String.valueOf(countryNames));
        countryNames.add(1,"France");
        countryNames.set(4,"Spain");
//        countryNames.remove(5);
        countryNames.remove("India");// remove the first occurrence
        String firstElement = countryNames.getFirst();
        String lastElement = countryNames.getLast();
        String randomElement = countryNames.get(2);
        logger.info(String.valueOf(countryNames));
    }

}
