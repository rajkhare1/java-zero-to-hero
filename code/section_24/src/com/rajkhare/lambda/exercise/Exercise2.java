package com.rajkhare.lambda.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercise2 {

    public static void main(String[] args) {
        System.out.println(filterByAge(29));
        System.out.println(filterByCity("New York"));
    }

    public static List<Person> filterByAge(int age) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));
        // Write your code below
        List<Person> filterByAgeList = filter(persons, person -> person.getAge() > age);

        return filterByAgeList;
    }

    public static List<Person> filterByCity(String city) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));
        // Write your code below
        List<Person> filterByCityList = filter(persons, person -> person.getCity().equals(city));
        return filterByCityList;
    }

    public static List<Person> filter(List<Person> persons, Predicate<Person> predicate) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (predicate.test(person)) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }
}
