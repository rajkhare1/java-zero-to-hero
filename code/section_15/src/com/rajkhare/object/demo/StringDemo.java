package com.rajkhare.object.demo;

import java.util.logging.Logger;

public class StringDemo {

    private static Logger logger = Logger.getLogger(StringDemo.class.getName());

    public static void main(String[] args) {
        String str1 = new String("John");
        String str2 = new String("John");
        logger.info(""+str1.hashCode());
        logger.info(""+str2.hashCode());
        logger.info(""+str1.equals(str2));
        logger.info(str1.toString());
    }

}
