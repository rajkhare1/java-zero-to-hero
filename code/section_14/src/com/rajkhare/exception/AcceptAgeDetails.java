package com.rajkhare.exception;

import com.rajkhare.exception.custom.InvalidAgeException;

import java.util.Scanner;
import java.util.logging.Logger;

public class AcceptAgeDetails {

    private static Logger logger = Logger.getLogger(AcceptAgeDetails.class.getName());

    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter your Age:");
        int age = scanner.nextInt();
        if(age < 0 || age > 100) {
            throw new InvalidAgeException("Invalid age details entered. Please enter a age between 0-100");
        }
        logger.info("Your age is: "+age);
    }

}
