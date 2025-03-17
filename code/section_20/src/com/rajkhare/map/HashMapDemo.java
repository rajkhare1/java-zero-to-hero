package com.rajkhare.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
//        Map<String, String> countryMap = new HashMap<>();// 1'st approach
//        HashMap<String, String> countryMap = new HashMap<>();// 2'nd approach
        var countryMap = new HashMap<String, String>();// 3'rd approach
        countryMap.put("India", "New Delhi");
        countryMap.put("India", "New Delhi 1");// this will be overridden previous value because map will now allow duplicate key
        countryMap.put("USA", "Washington DC");
        countryMap.put("France", "Paris");
        countryMap.put(null, null);// can allow null key, value

    }

}
