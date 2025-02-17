package com.rajkhare.object.demo;

import java.util.Objects;
import java.util.logging.Logger;

public class Person implements Cloneable{

    private static Logger logger = Logger.getLogger(Person.class.getName());

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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && gender == person.gender && ssn == person.ssn && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, ssn);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ssn=" + ssn +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        logger.info("Object is being destroyed");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
