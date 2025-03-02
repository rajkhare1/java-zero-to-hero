package com.rajkhare.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class StudentSortingDemo {

    private static Logger logger = Logger.getLogger(StudentSortingDemo.class.getName());

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("John",167, 97));
        students.add(new Student("Smith",168, 92));
        students.add(new Student("Will",169, 92));
        students.add(new Student("Raj",170, 99));
        logger.info(""+students);
        Collections.sort(students);
        logger.info(""+students);


        var students1 = new ArrayList<Student>();
        students1.add(new Student("John",167, 97));
        students1.add(new Student("Smith",168, 92));
        students1.add(new Student("Will",169, 92));
        students1.add(new Student("Raj",170, 99));
        logger.info(""+students1);
//        Collections.sort(students1, new StudentComparator());
        Collections.sort(students1, new StudentMarksComparator());
//        students1.sort(new StudentComparator());// 2nd approach available only with sorting with Comparator
        logger.info(""+students1);

    }

}
