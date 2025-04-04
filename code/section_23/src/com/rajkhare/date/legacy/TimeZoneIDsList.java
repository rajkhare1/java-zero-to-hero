package com.rajkhare.date.legacy;

import java.util.TimeZone;
import java.util.logging.Logger;

public class TimeZoneIDsList {

    private static Logger logger = Logger.getLogger(TimeZoneIDsList.class.getName());

    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String availableID : availableIDs) {
            logger.info(availableID);
        }
    }

}
