package com.rajkhare.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionDemo {

    private static Logger logger = Logger.getLogger(ExceptionDemo.class.getName());

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            logger.info("Enter a number....");
            int number = scanner.nextInt();
            logger.info("" + number);


        } catch (Exception ex) {
            logger.severe("Please provide input in numerical format and try again...");

        } finally {
            logger.info("finally block is being executed");
            if(null != scanner)
                scanner.close();
        }


    }

}
