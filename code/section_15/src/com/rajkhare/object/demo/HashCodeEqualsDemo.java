package com.rajkhare.object.demo;

import java.util.logging.Logger;

public class HashCodeEqualsDemo {

    private static Logger logger = Logger.getLogger(HashCodeEqualsDemo.class.getName());

    public static void main(String[] args) {
        Person p1 = new Person("John",25,'M',564323456);
        Person p2 = new Person("John",25,'M',564323456);
        logger.info(""+p1.hashCode());
        logger.info(""+p2.hashCode());
        logger.info(""+p1.equals(p2));
    }

}
