package com.rajkhare.date.legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

public class CalendarDemo {

    private static Logger logger = Logger.getLogger(CalendarDemo.class.getName());

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2100, Calendar.JANUARY, 1);
        logger.info("gregorianCalendar : "+gregorianCalendar);
        Date currentDate = gregorianCalendar.getTime();
        logger.info("currentDate : "+currentDate);

        int year = gregorianCalendar.get(Calendar.YEAR);
        int month = gregorianCalendar.get(Calendar.MONTH);
        int date = gregorianCalendar.get(Calendar.DATE);
        int hours = gregorianCalendar.get(Calendar.HOUR_OF_DAY);
        int minutes = gregorianCalendar.get(Calendar.MINUTE);
        int seconds = gregorianCalendar.get(Calendar.SECOND);
        int milliSeconds = gregorianCalendar.get(Calendar.MILLISECOND);

        System.out.printf("Current Date and Time in : %04d-%02d-%02d  %02d:%02d:%02d:%04d%n",
                year, month, date, hours, minutes, seconds, milliSeconds);

        gregorianCalendar.set(Calendar.YEAR, 2101);
        gregorianCalendar.set(Calendar.MONTH, Calendar.FEBRUARY);

        Date updatedCurrentDate = gregorianCalendar.getTime();
        logger.info("updatedCurrentDate : "+updatedCurrentDate);

        // How to format GregorianCalendar:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(gregorianCalendar.getTime());
        logger.info("formattedDate : "+formattedDate);

        // How to add/subtract something in GregorianCalendar
        gregorianCalendar.add(Calendar.HOUR, 2);// add 2 hours in time
        gregorianCalendar.add(Calendar.MONTH, -3);// subtract 3 Month in time [no extra subtract method, only handled by negative value]
        formattedDate = dateFormat.format(gregorianCalendar.getTime());
        logger.info("formattedDate : "+formattedDate);

        // How to check Leap Year in GregorianCalendar
        boolean isLeapYear = gregorianCalendar.isLeapYear(2048);
        logger.info("isLeapYear : "+isLeapYear);


    }

}
