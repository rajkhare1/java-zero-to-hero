package com.rajkhare.wrapper;

import java.util.logging.Logger;

public class BoxingDemo {

    private static Logger logger = Logger.getLogger(BoxingDemo.class.getName());

    public static void main(String[] args) {
        int num = 16;

        // Approach 1 - With the help of the Constructor
        Integer integer = new Integer(num);
        Double aDouble = new Double(3.14);
        Long aLong = new Long("95657");

        // Approach 2 - With the hell of valueOf()
        Integer integer1 = Integer.valueOf(num);
        Double aDouble1 = Double.valueOf("3.14");
        Long aLong1 = Long.valueOf("95657");

        // Parsing
        int num1 = Integer.parseInt("18");
        logger.info(""+num1);
    }

}
