package com.rajkhare.date.newapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.logging.Logger;

public class NewDateTimeAPIDemo {

    private static Logger logger = Logger.getLogger(NewDateTimeAPIDemo.class.getName());

    public static void main(String[] args) {
        // How to create the default Object of new Date APIs : now()
        LocalDate dateOnly = LocalDate.now();// 2025-04-05
        LocalTime timeOnly = LocalTime.now();// 04:33:39.099498
        LocalDateTime dateTime = LocalDateTime.now();// 2025-04-05T04:33:39.099734
        ZonedDateTime dateTimeWithZone = ZonedDateTime.now();// 2025-04-05T04:33:39.100961+05:30[Asia/Kolkata]
        logger.info("dateOnly: "+dateOnly);
        logger.info("timeOnly: "+timeOnly);
        logger.info("dateTime: "+dateTime);
        logger.info("dateTimeWithZone: "+dateTimeWithZone);
    }

}
