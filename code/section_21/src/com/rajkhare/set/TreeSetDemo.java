package com.rajkhare.set;

import java.util.TreeSet;
import java.util.logging.Logger;

public class TreeSetDemo {

    private static Logger logger = Logger.getLogger(TreeSetDemo.class.getName());

    public static void main(String[] args) {
        var treeSet = new TreeSet<String>();
        treeSet.add("India");
        treeSet.add("USA");
        treeSet.add("Germany");

        logger.info("treeSet : "+treeSet);
        treeSet.remove("Germany");
        logger.info("treeSet after removal : "+treeSet);
        logger.info("size of treeSet : "+treeSet.size());
        logger.info("is india present inside treeSet : "+treeSet.contains("India"));
        logger.info("first element of treeSet : "+treeSet.first());
        logger.info("last element of treeSet : "+treeSet.last());
    }

}
