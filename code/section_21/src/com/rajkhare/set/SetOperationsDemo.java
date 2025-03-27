package com.rajkhare.set;

import java.util.HashSet;
import java.util.logging.Logger;

public class SetOperationsDemo {

    private static Logger logger = Logger.getLogger(SetOperationsDemo.class.getName());

    public static void main(String[] args) {
        var hashset1 = new HashSet<Integer>();
        hashset1.add(7);
        hashset1.add(4);
        hashset1.add(1);

        var hashset2 = new HashSet<Integer>();
        hashset2.add(1);
        hashset2.add(7);

        // Union
//        hashset1.addAll(hashset2);
        // Intersection (common element)
//        hashset1.retainAll(hashset2);
        // Difference (all common will we removed)
//        hashset1.removeAll(hashset2);
        // Subset
        boolean isSubset = hashset1.containsAll(hashset2);
        logger.info("isSubset : "+isSubset);
        logger.info("hashset1 : "+hashset1);
        logger.info("hashset2 :"+hashset2);
    }

}
