package com.rajkhare.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class LowerBoundWildCardDemo {

    private static Logger logger = Logger.getLogger(LowerBoundWildCardDemo.class.getName());

    public static void main(String[] args) {
        addNumbers(new ArrayList<>());
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
//        list.add(3.14);// compilation error because double having no relation with Integer
        logger.info(""+list);
    }

}
