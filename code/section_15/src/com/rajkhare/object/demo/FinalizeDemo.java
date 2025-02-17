package com.rajkhare.object.demo;

import java.util.logging.Logger;

public class FinalizeDemo {

    private static Logger logger = Logger.getLogger(FinalizeDemo.class.getName());

    public static void main(String[] args) {
        for(int i=0;i<10000;i++) {
            logger.info(""+i);
            new Person();
        }
    }

}
