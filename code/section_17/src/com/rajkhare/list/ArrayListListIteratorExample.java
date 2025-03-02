package com.rajkhare.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;

public class ArrayListListIteratorExample {

    private static Logger logger = Logger.getLogger(ArrayListListIteratorExample.class.getName());

    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();

        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        ListIterator<String> listIterator = countryNames.listIterator();

        while (listIterator.hasNext()) {
            String country = listIterator.next();
            logger.info(country);
        }

        while (listIterator.hasPrevious()) {
            String country = listIterator.previous();
            logger.info(country);
        }
    }

}
