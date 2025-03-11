package com.rajkhare.generics;

import java.util.ArrayList;

public class CollectionsWithOutGenericDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(true);

        // problem we need to typecast otherwise it useless in the business
        String greeting = (String) list.get(0);
        int number = (Integer) list.get(1);
        double flag = (Double) list.get(2);// ClassCastException

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
//        list1.add(123);// not allowed
//        list1.add(true); // not allowed

        String greeting1 =  list1.get(0); // casting not required
//        int number = (Integer) list1.get(1);// not allowed
//        double flag = (Double) list1.get(2);// ClassCastException
    }

}
