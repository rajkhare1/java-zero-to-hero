package com.rajkhare.list;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class LinkedListDemo {

    private static Logger logger = Logger.getLogger(LinkedListDemo.class.getName());

    public static void main(String[] args) {
        // 3 ways to create the object of linked list
        LinkedList<Integer> nums = new LinkedList<>();
        List<Double> doubleNums = new LinkedList<>();
        var countryNames = new LinkedList<String>();

        // how to store the elements in the liked list
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        logger.info(String.valueOf(countryNames));

        // demo of replace element using set()
        countryNames.set(4,"Spain");
        logger.info(String.valueOf(countryNames));

        // demo of delete element using remove()
        countryNames.remove("India");// will remove the first occurrence
        logger.info(String.valueOf(countryNames));

        // demo of sequenced collections using method: getFirst(), getLast()
        String firstElement = countryNames.getFirst();
        String lastElement = countryNames.getLast();

        // demo of reverse
        LinkedList<String> reversedCountryNamesList = countryNames.reversed();
        logger.info(String.valueOf(reversedCountryNamesList));



    }

}
