package com.rajkhare.enumuration;

import java.util.logging.Logger;

public class AdvancedPriorityEnumTest {

    private static Logger logger = Logger.getLogger(AdvancedPriorityEnumTest.class.getName());

    public static void main(String[] args) {
        for (AdvancedPriorityEnum priorityEnum : AdvancedPriorityEnum.values()) {
            String name = priorityEnum.name();
            int ordinal = priorityEnum.ordinal();
            int days = priorityEnum.getEstimatedCompletionDays();
            logger.info("name = "+name+", ordinal = "+ordinal+", days = "+days);
        }
    }

}
