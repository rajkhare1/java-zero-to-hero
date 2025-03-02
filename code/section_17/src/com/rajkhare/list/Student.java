package com.rajkhare.list;

public class Student implements Comparable<Student> {

    String name;
    int rollNumber;
    int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int marksCompareResult = Integer.compare(this.marks, o.marks);
        if(marksCompareResult == 0) {
            return Integer.compare(this.rollNumber, o.rollNumber);
        }
        return marksCompareResult;
    }
}
