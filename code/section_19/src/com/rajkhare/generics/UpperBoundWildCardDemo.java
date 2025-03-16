package com.rajkhare.generics;

import com.rajkhare.generics.model.Developer;
import com.rajkhare.generics.model.Employee;
import com.rajkhare.generics.model.Manager;

import java.util.List;
import java.util.logging.Logger;

public class UpperBoundWildCardDemo {

    private static Logger logger = Logger.getLogger(UpperBoundWildCardDemo.class.getName());

    public static void main(String[] args) {

        List<Employee> employeeList = List.of(new Employee(), new Employee());
        printEmployeeName(employeeList);

        List<Developer> developerList = List.of(new Developer(), new Developer());
        printEmployeeName(developerList);// now covariance allowed because we are using upperbound wild card flavour

        List<Manager> managerList = List.of(new Manager(), new Manager());
        printEmployeeName(managerList);// now covariance allowed because we are using upperbound wild card flavour
    }

    public static void printEmployeeName(List<? extends Employee> employees) {
//        employees.add(new Employee());// compilation error due to limitation of upperbound wild card flavour[can't add new element]
        for (Employee employee : employees) {
            logger.info(String.valueOf(employee));
        }
    }

}
