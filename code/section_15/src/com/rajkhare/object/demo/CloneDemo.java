package com.rajkhare.object.demo;

import java.util.logging.Logger;

public class CloneDemo {

    private static Logger logger = Logger.getLogger(CloneDemo.class.getName());

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("John", 25, 'M', 234323235);
        Person p2 = p1;
        p2.setName("John Doe");
        logger.info(p1.getName());
        Person p3 = (Person) p1.clone();
        logger.info(p3.getName());
        p3.setName("Will Smith");
        logger.info(p1.getName());
        logger.info(p3.getName());
    }

}
