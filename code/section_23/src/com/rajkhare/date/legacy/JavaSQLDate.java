package com.rajkhare.date.legacy;

import java.sql.Date;
import java.util.logging.Logger;

public class JavaSQLDate {

    private static Logger logger = Logger.getLogger(JavaSQLDate.class.getName());

    public static void main(String[] args) {
        Date currentDateSql = new Date(System.currentTimeMillis());
        logger.info("currentDateSql: "+currentDateSql);

        java.util.Date currentDateUtil = new java.util.Date(System.currentTimeMillis());
        logger.info("currentDateUtil: "+currentDateUtil);



    }

}
