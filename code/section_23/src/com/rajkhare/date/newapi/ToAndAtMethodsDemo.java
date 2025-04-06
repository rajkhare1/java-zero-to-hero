package com.rajkhare.date.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.logging.Logger;

public class ToAndAtMethodsDemo {

    private static Logger logger = Logger.getLogger(ToAndAtMethodsDemo.class.getName());

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2015,Month.MARCH,18,22,30);// 2015-03-18T22:30
        logger.info("dateTime: "+dateTime);

        LocalDate date = dateTime.toLocalDate();// 2015-03-18
        LocalTime time = dateTime.toLocalTime();// 22:30
        logger.info("date: "+date);
        logger.info("time: "+time);

        LocalDate localDate = LocalDate.of(2015, 3, 18);
        LocalDateTime startOfDay = localDate.atStartOfDay();// 2015-03-18T00:00
        logger.info("startOfDay: "+startOfDay);

        LocalDateTime dateTime1 = localDate.atTime(18, 20);// 2015-03-18T18:20
        logger.info("dateTime1: "+dateTime1);

    }

}
