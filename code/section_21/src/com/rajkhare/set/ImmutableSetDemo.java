package com.rajkhare.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class ImmutableSetDemo {

    private static Logger logger =Logger.getLogger(ImmutableSetDemo.class.getName());

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(Arrays.asList("a", "b", "c"));
        stringSet = Collections.unmodifiableSet(stringSet);
//        processSet(stringSet);

        Set<String> stringSet1 = Set.of("a", "b", "c");
        processSet(stringSet1);
    }

    public static void processSet(Set<String> stringSet) {
//        stringSet.add("d");
        for (String element : stringSet) {
            logger.info(element.toUpperCase());
        }
    }
}
