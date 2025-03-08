package com.rajkhare.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Logger;

public class LinkedListIteration {

    private static Logger logger = Logger.getLogger(LinkedListIteration.class.getName());

    public static void main(String[] args) {

        var countryNames = new LinkedList<String>();

        // how to store the elements in the liked list
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");


        // demo of iterate the elements of Linked list:
        // 1- way : using foreach loop
        logger.info("-------------1. foreach--------------");
        for(String countryName : countryNames) {
            logger.info(countryName);
        }

        logger.info("-------------2. iterator (forward direction only)--------------");
        // 2 - iterate using Iterator
        Iterator<String> iterator = countryNames.iterator();
        while(iterator.hasNext()) {
            logger.info(iterator.next());
        }

        logger.info("-------------3. listIterator forward direction--------------");
        ListIterator<String> listIterator = countryNames.listIterator();
        while (listIterator.hasNext()) {
            logger.info(listIterator.next());
        }

        logger.info("-------------3. listIterator reverse direction--------------");
        while (listIterator.hasPrevious()){
            logger.info(listIterator.previous());
        }
    }

}
