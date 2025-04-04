package com.rajkhare.date.legacy;

import java.util.Date;
import java.util.logging.Logger;

public class JavaUtilDate {

    private static Logger logger = Logger.getLogger(JavaUtilDate.class.getName());

    public static void main(String[] args) {
        Date currentDate = new Date();// Current date and time value
        currentDate.setYear(200);
        logger.info("currentDate: "+currentDate);// Fri Apr 02 17:04:22 IST 2100
        /**
         *  In computing, an epoc is a fixed date and time used as a reference from
         *  which a computer measures system time
         * */
        long timeInMills = currentDate.getTime();
        logger.info("timeInMills: "+timeInMills);// 1743551546310

        Date futureDate = new Date(200, 8, 26, 8, 15, 39);
        logger.info("futureDate: "+futureDate);// Sun Sep 26 08:15:39 IST 2100

        long timeInMills1 = futureDate.getTime();
        logger.info("timeInMills1: "+timeInMills1);
        Date date = new Date(timeInMills1+86400000);
        logger.info("date: "+date);// Mon Sep 27 08:15:39 IST 2100

        boolean isAfter = date.after(futureDate);
        logger.info("isAfter: "+isAfter);

    }

}
