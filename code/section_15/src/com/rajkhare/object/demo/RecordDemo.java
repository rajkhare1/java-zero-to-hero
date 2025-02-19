package com.rajkhare.object.demo;

import java.lang.reflect.RecordComponent;
import java.util.logging.Logger;

public class RecordDemo {

    private static Logger logger = Logger.getLogger(RecordDemo.class.getName());

    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("John","Doctor");
        logger.info(personRecord.name());
        logger.info(personRecord.occupation());
        logger.info(""+personRecord);

        Class personRecordClass = personRecord.getClass();
        logger.info(""+personRecordClass.isRecord());

        RecordComponent[] recordComponents = personRecordClass.getRecordComponents();
        for (RecordComponent r : recordComponents) {
            logger.info(r.toString());
        }

    }

}
