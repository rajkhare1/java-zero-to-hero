package com.rajkhare.generics;

import java.util.logging.Logger;

public class NonGenericCodeDemo {

    private static Logger logger = Logger.getLogger(NonGenericCodeDemo.class.getName());

    public static void main(String[] args) {
        Pair stringIntPair = new Pair("Hello", 42);
        stringIntPair.setFirst(16);
        String myString = (String) stringIntPair.getFirst();// Requires casting
        int myInt = (Integer) stringIntPair.getSecond();// Requires casting
        logger.info(myString);
        logger.info(String.valueOf(myInt));
    }

}
