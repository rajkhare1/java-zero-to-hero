package com.rajkhare.date.legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Logger;

public class TimeZoneDatesDemo {

    private static Logger logger = Logger.getLogger(TimeZoneDatesDemo.class.getName());

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("America/Bogota"));
        String formattedDate = dateFormat.format(new Date());
        logger.info("formattedDate: "+formattedDate);

        dateFormat.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        formattedDate = dateFormat.format(new Date());
        logger.info("formattedDate: "+formattedDate);

        // Above is very lengthy process but with the help of Gregorian Calendar it is simple:
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("America/Bogota"));
        int year = gregorianCalendar.get(Calendar.YEAR);
        int month = gregorianCalendar.get(Calendar.MONTH);
        int date = gregorianCalendar.get(Calendar.DATE);
        int hours = gregorianCalendar.get(Calendar.HOUR_OF_DAY);
        int minutes = gregorianCalendar.get(Calendar.MINUTE);
        int seconds = gregorianCalendar.get(Calendar.SECOND);
        int milliSeconds = gregorianCalendar.get(Calendar.MILLISECOND);


        System.out.printf("Current Date and Time in : %04d-%02d-%02d  %02d:%02d:%02d:%04d%n",
                year, month, date, hours, minutes, seconds, milliSeconds);

        logger.info(""+gregorianCalendar.getTime());// Problem: it will show the default time zone not what we set
    }

}
