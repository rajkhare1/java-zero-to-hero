package com.rajkhare.map;

import java.util.*;
import java.util.logging.Logger;

public class HashMapIterationDemo {

    private static Logger logger = Logger.getLogger(HashMapIterationDemo.class.getName());

    public static void main(String[] args) {
        var countryMap = new HashMap<String, String>();
        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington, DC");
        countryMap.put("France", "Paris");
//        approach1(countryMap);
//        approach2(countryMap);
        approach3(countryMap);
    }

    public static void approach1(HashMap<String, String> countryMap) {
        Set<String> keys = countryMap.keySet();// in approach 1 we are using the keySet() method
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            String capital = countryMap.get(key);
            logger.info(key +" : "+capital);
        }
        /*for(String key: keys){
            String capital = countryMap.get(key);
            logger.info(key +" : "+capital);
        }*/
    }

    public static void approach2(HashMap<String, String> countryMap) {
        Set<Map.Entry<String, String>> entries = countryMap.entrySet();// in approach 2 we are using the entrySet() method
       /* Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String capital = entry.getValue();
            logger.info(key +" : "+capital);
        }*/
        for(Map.Entry<String, String> entry: entries){
            String key = entry.getKey();
            String capital = entry.getValue();
            logger.info(key +" : "+capital);
        }
    }

    public static void approach3(HashMap<String, String> countryMap) {
        Collection<String> values = countryMap.values();// in approach 3 we are using the values() method
        for(String value: values){
            String capital = value;
            logger.info("only values : "+capital);
        }
    }

}
