package com.rajkhare.app;

import com.rajkhare.model.Class1;
import com.rajkhare.model.Employee;
import com.rajkhare.model.Person;
import com.rajkhare.model.Vehicle;

import static com.rajkhare.utility.MyConstants.*;
import static java.lang.Math.PI;

public class MainClass {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Employee employee =  new Employee();

        String input = new String("Hello");
        Integer num;

        System.out.println(TAX_RATE);
        System.out.println(SHIPPING_COST);

        System.out.println(calculateTotalCost(9.99));

        System.out.println(PI);

        Class1 model = new Class1();
        com.rajkhare.service.Class1 service = new com.rajkhare.service.Class1();

        MyOuterClass.MyInnerClass myInnerClass = new MyOuterClass.MyInnerClass();
        myInnerClass.display();

        AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(25);
        person.setSalary(10000.00);

        System.out.println(person.getFirstName());


    }

}
