package com.semanticsquare.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentTest {

    @Test
    void enroll() {
        // Setting input
        Student student = new Student("Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);
        Course course1 = new Course(1, "Java In-Depth", null);

        // Method execution
        student.enroll(course1);

        // Test output
        assertTrue(student.getEnrolledCourses().size() <= Student.COURSE_ENROLL_LIMIT,
                "Enrollment limit exceeded. Should never happen. Debug!!");

        Course course2 = new Course(2, "Algorithms", "CS");
        student.enroll(course2);
        assertTrue(student.getEnrolledCourses().size() <= Student.COURSE_ENROLL_LIMIT,
                "Enrollment limit exceeded. Should never happen. Debug!!");

        Course course3 = new Course(3, "Data Structures", "CS");
        student.enroll(course3);
        assertTrue(student.getEnrolledCourses().size() <= Student.COURSE_ENROLL_LIMIT,
                "Enrollment limit exceeded. Should never happen. Debug!!");

        Course course4 = new Course(4, "Operating Systems", "CS");
        student.enroll(course4);
         assertTrue(student.getEnrolledCourses().size() <= Student.COURSE_ENROLL_LIMIT,
                "Enrollment limit exceeded. Should never happen. Debug!!");
    }
}