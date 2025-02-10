package com.rajkhare.exception;

import java.util.logging.Logger;

public class NestedTryDemo {

    private static Logger logger = Logger.getLogger(NestedTryDemo.class.getName());

    public static void main(String[] args) {
        try {
            nestedTryBlock();
        } catch (Exception e) {
            logger.severe("Exception caught in main method: "+e.getMessage());
        }

    }

    static void nestedTryBlock() {
        try {
            logger.info("Outer try block: Start");

            try {
                logger.info("Inner try block: Start");
                // Simulating an arithmetic exception
                int result = 10/0;
                logger.info("Inner try block: End");
            } catch (ArithmeticException e) {
                logger.severe("ArithmeticException caught in inner try block: "+e.getMessage());
            } finally {
                logger.info("Inner try block: Finally block");
            }
            logger.info("Outer try block: End");
        } catch (ArithmeticException e) {
            logger.severe("ArithmeticException caught in outer try block: "+e.getMessage());
        } finally {
            logger.info("Outer try block: Finally block");
        }
    }
}
