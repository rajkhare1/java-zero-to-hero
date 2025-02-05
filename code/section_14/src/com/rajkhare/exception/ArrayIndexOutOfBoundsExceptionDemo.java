package com.rajkhare.exception;

import java.util.logging.Logger;

public class ArrayIndexOutOfBoundsExceptionDemo {

    private static Logger logger = Logger.getLogger(ArrayIndexOutOfBoundsExceptionDemo.class.getName());

    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3,4,5};
            logger.info(""+numbers[5]);
        } catch (Exception ex) {
            logger.severe("Invalid Array index. Please try again with valid index number");
        }

    }

}
