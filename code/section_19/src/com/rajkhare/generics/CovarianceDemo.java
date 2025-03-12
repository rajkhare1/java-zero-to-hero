package com.rajkhare.generics;

import com.rajkhare.generics.model.Developer;
import com.rajkhare.generics.model.Employee;
import com.rajkhare.generics.model.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CovarianceDemo {

    private static Logger logger = Logger.getLogger(CovarianceDemo.class.getName());

    public static void main(String[] args) {

        Employee[] employees = {new Employee(), new Employee()};
        printArray(employees);
        Developer[] developers = {new Developer(), new Developer()};
        printArray(developers);
        Manager[] managers = {new Manager(),new Manager()};
        printArray(managers);

        String s = "Generics";
        Object o = s;// covariance

        String[] sArray = {"Generics","Collections"};
        Object[] objArray = sArray;// covariance

        List<String> sList = new ArrayList<>();
        List<Object> oList = new ArrayList<>();
//        oList = sList;//(compilation error) covariance will not work for the collections

        // why collection doesn't support covariance?
        Number[] numArray = {1,2,3};
        Object[] objectArray = numArray;// covariance
        objectArray[0] = "String";// dumbo compiler :) [will generate ArrayStoreException]



    }

    public static void printArray(Employee[] employees) {
        for (Employee employee : employees) {
            logger.info(String.valueOf(employee));
        }
    }

}
