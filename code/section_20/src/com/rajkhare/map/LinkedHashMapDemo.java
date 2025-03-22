package com.rajkhare.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;
import java.util.logging.Logger;

public class LinkedHashMapDemo {

    private static Logger logger = Logger.getLogger(LinkedHashMapDemo.class.getName());

    public static void main(String[] args) {
        var linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(7, "Seven");
        linkedHashMap.put(2, "Two");

        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            logger.info(entry.getKey()+"-"+entry.getValue());
        }

        SequencedMap<Integer, String> reversedLinkedHashMap = linkedHashMap.reversed();
        for (Map.Entry<Integer, String> entry : reversedLinkedHashMap.entrySet()) {
            logger.info(entry.getKey()+":"+entry.getValue());
        }

    }

}
