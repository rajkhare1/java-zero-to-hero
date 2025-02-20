package com.rajkhare.wrapper;

import java.util.logging.Logger;

public class UnBoxingDemo {

    private static Logger logger = Logger.getLogger(UnBoxingDemo.class.getName());

    public static void main(String[] args) {
        int num = 16;
        // Boxing
        Integer integer1 = Integer.valueOf(num);
        Double aDouble1 = Double.valueOf("3.14");
        Long aLong1 = Long.valueOf("95657");

        // UnBoxing
        int int1 = integer1.intValue();
        double double1 = aDouble1.doubleValue();
        long long1 = aLong1.longValue();

        logger.info(""+int1);
        logger.info(""+double1);
        logger.info(""+long1);
    }

}
