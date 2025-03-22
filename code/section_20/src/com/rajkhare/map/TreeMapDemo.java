package com.rajkhare.map;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

public class TreeMapDemo {

    private static Logger logger = Logger.getLogger(TreeMapDemo.class.getName());

    public static void main(String[] args) {
        var numbers = new TreeMap<Integer, String>();
        numbers.put(23, "Twenty three");
        numbers.put(12, "Twelve");
        numbers.put(42, "Forty two");
        numbers.put(3, "Three");
        numbers.put(19, "Nineteen");
        numbers.put(48, "Forty eight");
        numbers.put(76, "Seventy six");

        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            logger.info(entry.getKey()+"-"+entry.getValue());
        }
    }

}
