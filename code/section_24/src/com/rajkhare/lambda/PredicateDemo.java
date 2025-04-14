package com.rajkhare.lambda;

import java.util.function.Predicate;
import java.util.logging.Logger;

public class PredicateDemo {

    private static Logger logger = Logger.getLogger(PredicateDemo.class.getName());

    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num%2==0;
        logger.info("isEven: "+isEven.test(16));// true
        logger.info("isEven: "+isEven.test(13));// false

        Predicate<Integer> isGreaterThan50 = num -> num>50;
        logger.info("isGreaterThan50: "+isGreaterThan50.test(61));// true
        logger.info("isGreaterThan50: "+isGreaterThan50.test(31));// false

        // How to chain multiple predicate
        // To check if number is even and greater than 50
        logger.info(""+isEven.and(isGreaterThan50).test(62));// true
        logger.info(""+isEven.and(isGreaterThan50).test(63));// false

        // To check if number is even or greater than 50
        logger.info(""+isEven.or(isGreaterThan50).test(62));// true
        logger.info(""+isEven.or(isGreaterThan50).test(63));// true

    }

}
