package com.rajkhare.object.demo;

import java.util.logging.Logger;

public class MutableDemo {

    private static Logger logger = Logger.getLogger(MutableDemo.class.getName());

    public static void main(String[] args) {
        MutablePerson mutablePerson = new MutablePerson("John", "Software Engineer");
        logger.info(mutablePerson.getOccupation());
        mutablePerson.setOccupation("Doctor");
        logger.info(mutablePerson.getOccupation());
    }

}
