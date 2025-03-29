package com.rajkhare.set;

import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.logging.Logger;

public class LinkedHashSetDemo {

    private static Logger logger = Logger.getLogger(LinkedHashSetDemo.class.getName());

    public static void main(String[] args) {
        var visitedCountries = new LinkedHashSet<String>();
        visitedCountries.add("India");
        visitedCountries.add("USA");
        visitedCountries.add("Dubai");
        visitedCountries.add("Singapore");
        visitedCountries.add("France");

        for (String visitedCountry : visitedCountries) {
            logger.info(visitedCountry);
        }

        SequencedSet<String> reveredVisitedCountries = visitedCountries.reversed();
        logger.info("reveredVisitedCountries : "+reveredVisitedCountries);
    }

}
