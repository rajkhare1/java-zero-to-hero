package com.rajkhare.exception;

import java.util.Scanner;
import java.util.logging.Logger;

public class ThrowDemo {

    private static Logger logger = Logger.getLogger(ThrowDemo.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Please enter the numerator value");
        String num1 = scanner.next();
        logger.info("Please enter the denominator value");
        String num2 = scanner.next();
        Division division = new Division();
        if(num2.equals("0")) {
            throw new ArithmeticException("Division by zero");
        }
        double output = division.divide(num1, num2);
        logger.info(""+output);
    }

}
