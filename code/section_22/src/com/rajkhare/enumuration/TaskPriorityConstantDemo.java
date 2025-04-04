package com.rajkhare.enumuration;

import java.util.logging.Logger;

public class TaskPriorityConstantDemo {

    private static Logger logger = Logger.getLogger(TaskPriorityConstantDemo.class.getName());
    private PriorityEnum priority;

    public static void main(String[] args) {
        PriorityEnum priorityEnum = null;
        logger.info("Estimated Time: "+TaskUtil.getEstimatedCompletionTime(PriorityEnum.LOW));
        logger.info("Estimated Time: "+TaskUtil.getEstimatedCompletionTime(PriorityEnum.MEDIUM));
        logger.info("Estimated Time: "+TaskUtil.getEstimatedCompletionTime(PriorityEnum.HIGH));
        logger.info("Estimated Time: "+TaskUtil.getEstimatedCompletionTime(PriorityEnum.URGENT));
        logger.info(""+PriorityEnum.URGENT);
    }

}
