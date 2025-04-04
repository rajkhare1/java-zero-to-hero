package com.rajkhare.date.legacy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class DateFormattingDemo {

    private static Logger logger = Logger.getLogger(DateFormattingDemo.class.getName());

    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();
         logger.info("currentDate: "+currentDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        logger.info("formattedDate: "+formattedDate);// 02-Apr-2025 18:02:21

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MMMM/yyyy");
        String formattedDate1 = dateFormat1.format(currentDate);
        logger.info("formattedDate1: "+formattedDate1);// 03/April/2025

        String dateString = "2100-09-26 14:30:00";
        SimpleDateFormat dateStoredFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate = dateStoredFormat.parse(dateString);
        logger.info("parsedDate: "+parsedDate);// Sun Sep 26 14:30:00 IST 2100

    }

}
