package com.rajkhare.generics;

import java.util.logging.Logger;

public class GenericMethodDemo {

    private static Logger logger = Logger.getLogger(GenericMethodDemo.class.getName());

    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);
        Integer[] intArray = {1,2,3,4,5};
        printArray(intArray);
    }

    public static <T>void printArray(T[] array) {
        for(T element : array){
            logger.info(String.valueOf(element));
        }
    }

}
