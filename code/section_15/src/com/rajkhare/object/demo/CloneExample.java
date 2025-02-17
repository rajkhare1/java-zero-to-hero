package com.rajkhare.object.demo;

import java.util.logging.Logger;

public class CloneExample {

    private static Logger logger = Logger.getLogger(CloneExample.class.getName());

    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course();
        course.setCourseName("Math");

        Student originalStudent = new Student("Alice",course);
        Student clonedStudent = (Student) originalStudent.clone();
        logger.info(""+(originalStudent == clonedStudent));//false
        logger.info(""+(originalStudent.getCourse() == clonedStudent.getCourse()));//true
    }

}
