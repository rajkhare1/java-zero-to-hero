package com.rajkhare.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionDemo {

    private static Logger logger = Logger.getLogger(ExceptionDemo.class.getName());

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            logger.info("Enter a number....");
            int number = scanner.nextInt();
            logger.info(""+number);

            scanner.close();
        } catch (Exception ex){
            logger.severe("Please provide input in numerical format and try again...");

        }


    }

}
