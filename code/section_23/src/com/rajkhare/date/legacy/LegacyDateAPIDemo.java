package com.rajkhare.date.legacy;

import java.util.Date;
import java.util.logging.Logger;

public class LegacyDateAPIDemo {

    private static Logger logger = Logger.getLogger(LegacyDateAPIDemo.class.getName());

    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(200, 8, 26);
        logger.info("date1: "+date1);
    }

}
