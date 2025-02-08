package com.rajkhare.exception;

import java.util.Scanner;
import java.util.logging.Logger;

public class TryWithResourcesDemo {

    private static Logger logger = Logger.getLogger(TryWithResourcesDemo.class.getName());

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            logger.info("Enter a number....");
            int number = scanner.nextInt();
            logger.info("" + number);
        } catch (Exception ex) {
            logger.severe("Please provide input in numerical format and try again...");
        }
    }
}
