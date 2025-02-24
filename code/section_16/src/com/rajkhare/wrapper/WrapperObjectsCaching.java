package com.rajkhare.wrapper;

import java.util.logging.Logger;

/*
  Integer, Byte, Short, and Long
*/
public class WrapperObjectsCaching {

    private static Logger logger = Logger.getLogger(WrapperObjectsCaching.class.getName());

    public static void main(String[] args) {
        Integer intObj1 = 16;
        Integer intObj2 = 16;
        logger.info(String.valueOf(intObj1==intObj2));

        Integer intObj3 = -128;
        Integer intObj4 = -128;
        logger.info(String.valueOf(intObj3==intObj4));

        Integer intObj5 = 127;
        Integer intObj6 = 127;
        logger.info(String.valueOf(intObj5==intObj6));

        Integer intObj7 = new Integer(16);
        Integer intObj8 = new Integer(16);
        logger.info(String.valueOf(intObj7==intObj8));
    }

}
