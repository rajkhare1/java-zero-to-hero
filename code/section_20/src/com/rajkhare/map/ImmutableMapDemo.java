package com.rajkhare.map;

import java.util.Map;
import java.util.logging.Logger;
import static java.util.Map.entry;

public class ImmutableMapDemo {

    private static Logger logger = Logger.getLogger(ImmutableMapDemo.class.getName());

    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = Map.of("a",1,"b",2,"c",3);
//        processMap(stringIntegerMap);

        Map<Integer, String> integerStringMap = Map.ofEntries(entry(1, "Tom"), entry(2, "Dick"), entry(3, "Harry"));
        processMap1(integerStringMap);
    }

    public static void processMap(Map<String, Integer> stringIntegerMap) {
//        stringIntegerMap.put("d",4);// will throw UnsupportedOperationException
//        stringIntegerMap.remove("a");// will throw UnsupportedOperationException
//        stringIntegerMap.replace("a",4);// will throw UnsupportedOperationException
        for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
            logger.info(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void processMap1(Map<Integer, String> integerStringMap){
//        integerStringMap.put(4, "John");// will throw UnsupportedOperationException
        for (Map.Entry<Integer, String> entry : integerStringMap.entrySet()) {
            logger.info(entry.getKey()+":"+entry.getValue());
        }
    }


}
