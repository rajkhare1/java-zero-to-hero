package com.rajkhare.object.demo;

import java.util.logging.Logger;

public class GetClassDemo {

    private static Logger logger = Logger.getLogger(GetClassDemo.class.getName());

    public static void main(String[] args) {
        Person person = new Person();
        Class personClass = person.getClass();
        logger.info(personClass.getName());
        logger.info(personClass.getSimpleName());
        logger.info(personClass.getPackageName());
    }

}
