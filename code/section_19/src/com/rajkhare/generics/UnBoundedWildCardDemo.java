package com.rajkhare.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class UnBoundedWildCardDemo {

    private static Logger logger = Logger.getLogger(UnBoundedWildCardDemo.class.getName());

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3);
        List<String> strList = Arrays.asList("One","Two","Three");
        printList(intList);
        printList(strList);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            logger.info(""+obj);
        }
        logger.info("Size of List: "+list.size());
    }

}
