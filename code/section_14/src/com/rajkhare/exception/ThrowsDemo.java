package com.rajkhare.exception;

import java.util.logging.Logger;

public class ThrowsDemo {

    private static Logger logger = Logger.getLogger(ThrowsDemo.class.getName());

    public static void main(String[] args) {
        Division division = new Division();
        try {
            double  output = division.divide("4","2");
            logger.info(""+output);
        } catch (NumberFormatException | ArithmeticException ex) {
            logger.severe("Invalid data provided. Please provide valid numbers and try again...");
        }
    }

}
