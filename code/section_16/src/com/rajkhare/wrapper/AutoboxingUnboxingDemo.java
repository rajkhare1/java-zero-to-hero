package com.rajkhare.wrapper;

import java.util.logging.Logger;

public class AutoboxingUnboxingDemo {

    private static Logger logger = Logger.getLogger(AutoboxingUnboxingDemo.class.getName());

    public static void main(String[] args) {
        // Autoboxing
        Integer integer = 16;
        Character character = 'M';
        Boolean boolObj = false;

        // Autounboxing
        int num = integer;
        char m = character;
        boolean isFalse = boolObj;

        logger.info(""+num);
        logger.info(""+m);
        logger.info(""+isFalse);

        Integer nullObj = null;
        int num1 = nullObj;
    }

}
