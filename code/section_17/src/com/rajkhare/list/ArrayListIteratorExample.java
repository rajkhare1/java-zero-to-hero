package com.rajkhare.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class ArrayListIteratorExample {

    private static Logger logger = Logger.getLogger(ArrayListIteratorExample.class.getName());

    public static void main(String[] args) {
        List<String> countryNames = new ArrayList<>();

        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        Iterator<String> iterator = countryNames.iterator();

        while (iterator.hasNext()) {
            String country = iterator.next();
            logger.info(country);

            if(country.equals("India")){
                iterator.remove();
            }
        }
      logger.info(""+countryNames);

    }

}
