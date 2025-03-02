package com.rajkhare.list;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.marks, o2.marks);
    }

}
