package com.rajkhare.object.demo;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private char gender;
    private int ssn;

    public Person() {

    }

    public Person(String name, int age, char gender, int ssn) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, ssn);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
       if(o == null) {
           return false;
       }

    }

}
