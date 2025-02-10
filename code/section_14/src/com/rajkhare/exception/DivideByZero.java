package com.rajkhare.exception;

import com.rajkhare.exception.custom.DivideByZeroException;

import java.util.Scanner;
import java.util.logging.Logger;

public class DivideByZero {

    private static Logger logger = Logger.getLogger(DivideByZero.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Please enter a numerator number value to perform a division:");
        int numerator = scanner.nextInt();
        logger.info("Please enter a denominator number value to perform a division:");
        int denominator = scanner.nextInt();
        if(denominator == 0) {
            throw new DivideByZeroException("Denominator can't be zero");
        }
        int result = numerator/denominator;
        logger.info("Result of division is: "+result);
    }

}
