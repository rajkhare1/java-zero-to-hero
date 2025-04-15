package com.rajkhare.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

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

        logger.info(""+isEven.negate().test(63));// true

        Predicate<Integer> isOdd = Predicate.not(isEven);
        logger.info(String.valueOf(isOdd.test(4)));// false

        Predicate<Object> checkEquality = Predicate.isEqual("Raj Khare");
        logger.info(""+checkEquality.test("Raj Khare"));// true

        // Real life scenarios to use Predicate a lot
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenList = list.stream().filter(isEven).collect(Collectors.toList());
        logger.info("evenList: "+evenList);

    }

}
