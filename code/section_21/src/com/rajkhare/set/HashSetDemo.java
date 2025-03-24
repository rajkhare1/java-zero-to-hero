package com.rajkhare.set;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class HashSetDemo {

    private static Logger logger = Logger.getLogger(HashSetDemo.class.getName());

    public static void main(String[] args) {
        Set<String> visitedCountries =  new HashSet<>();
        visitedCountries.add("India");
        visitedCountries.add("USA");
        visitedCountries.add("Dubai");
        visitedCountries.add("Singapore");
        visitedCountries.add("France");
        visitedCountries.add("India");
        logger.info("Size; "+visitedCountries.size());// how many elements are stored in my collection.
        logger.info(""+visitedCountries);
        boolean isDubai = visitedCountries.contains("Dubai");
        logger.info("isDubai: "+isDubai);
        boolean isRemovedSingapore = visitedCountries.remove("Singapore");
        logger.info("isRemovedSingapore: "+isRemovedSingapore);
        logger.info(""+visitedCountries);
    }

}
