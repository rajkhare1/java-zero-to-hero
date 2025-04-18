package com.rajkhare.object.demo;

/**
 * 1) making the class as final
 * 2) make the fields as final and private
 * 3) generate the getter methods without any get prefix
 * 4) generate a constructor the fields mentioned inside the record header
 * 5) overrides the toString() , equals(), and hashCode()
 * @param name
 * @param occupation
 */
public record PersonRecord(String name, String occupation) {

    public static  String country = "USA";

    public PersonRecord {
        if (name == null || occupation == null) {
            throw new IllegalArgumentException();
        }
    }

}
