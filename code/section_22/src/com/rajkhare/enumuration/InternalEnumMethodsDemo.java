package com.rajkhare.enumuration;

import java.util.logging.Logger;

public class InternalEnumMethodsDemo {

    private static Logger logger = Logger.getLogger(InternalEnumMethodsDemo.class.getName());

    public static void main(String[] args) {
        for (PriorityEnum priorityEnum : PriorityEnum.values()) {
            String name = priorityEnum.name();
            int ordinal = priorityEnum.ordinal();
            logger.info(name+"("+ordinal+")");
        }

        PriorityEnum low = PriorityEnum.valueOf("LOW");
        logger.info("low: "+low);
        PriorityEnum high = PriorityEnum.values()[2];
        logger.info("high: "+high);
    }

}
