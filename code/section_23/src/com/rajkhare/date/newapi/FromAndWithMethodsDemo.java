package com.rajkhare.date.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.logging.Logger;

public class FromAndWithMethodsDemo {

    private static Logger logger = Logger.getLogger(FromAndWithMethodsDemo.class.getName());

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.MARCH, 18, 22, 30);// 2015-03-18T22:30
        logger.info("dateTime: "+dateTime);

        LocalDate derivedDate = LocalDate.from(dateTime);// 2015-03-18
        LocalTime derivedTime = LocalTime.from(dateTime);// 22:30
        logger.info("derivedDate: "+derivedDate);
        logger.info("derivedTime: "+derivedTime);

        LocalDateTime dateTime1 = dateTime.withYear(2030);// 2030-03-18T22:30
        LocalDateTime dateTime2 = dateTime.withYear(2030).withMonth(10);// 2030-10-18T22:30
        logger.info("dateTime1: "+dateTime1);
        logger.info("dateTime2: "+dateTime2);
    }

}
