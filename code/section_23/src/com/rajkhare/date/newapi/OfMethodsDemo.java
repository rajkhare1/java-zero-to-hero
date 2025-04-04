package com.rajkhare.date.newapi;

import java.time.*;
import java.util.logging.Logger;

public class OfMethodsDemo {

    private static Logger logger  = Logger.getLogger(OfMethodsDemo.class.getName());

    public static void main(String[] args) {
        // How to create the customized Object of new Date APIs : of()
        LocalDate date = LocalDate.of(2015, Month.MARCH, 18);// 2015-03-18
        LocalTime time = LocalTime.of(14, 30);// 14:30
        LocalDateTime dateTime = LocalDateTime.of(2015,3,18,14,30);// 2015-03-18T14:30
        ZoneId newYorkTimeZone = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2015,3,18,14,30,0,0,newYorkTimeZone);// 2015-03-18T14:30-04:00[America/New_York]
        logger.info("date: "+date);
        logger.info("time: "+time);
        logger.info("dateTime: "+dateTime);
        logger.info("zonedDateTime: "+zonedDateTime);

        LocalDate someDate = LocalDate.ofEpochDay(1000);// 1972-09-27
        LocalDate dayIn2000Year = LocalDate.ofYearDay(2001, 100);// 2001-04-10
        logger.info("someDate: "+someDate);
        logger.info("dayIn2000Year: "+dayIn2000Year);
    }

}
