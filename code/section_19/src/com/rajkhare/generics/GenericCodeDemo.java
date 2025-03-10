package com.rajkhare.generics;

import java.util.logging.Logger;

public class GenericCodeDemo {

    private static Logger logger = Logger.getLogger(GenericCodeDemo.class.getName());

    public static void main(String[] args) {
        GenericPair<String,Integer> stringIntPair = new GenericPair<>("Hello", 42);
        stringIntPair.setFirst("Another String");
        stringIntPair.setSecond(123);
        String myString =  stringIntPair.getFirst();
        int myInt =  stringIntPair.getSecond();
        logger.info(myString);
        logger.info(String.valueOf(myInt));
    }

}
