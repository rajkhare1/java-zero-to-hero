package com.rajkhare.list;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int marksCompareResult = Integer.compare(o1.marks, o2.marks);
        if(marksCompareResult == 0) {
            return Integer.compare(o1.rollNumber, o2.rollNumber);
        }
        return marksCompareResult;
    }

}
