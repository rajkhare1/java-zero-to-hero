package com.semanticsquare.basics;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public static final int COURSE_ENROLL_LIMIT = 3;

	static int studentCount;
	static int idInitializer = 1000;
	
	private final int id = idInitializer++;
	private String name;
	private int iGender;
	private String gender;
	private int age;
	private long phone;
	private double gpa;
	private char degree;

	private boolean international;
	private double tuitionFees = 12000.0;
	private double internationalFees = 5000.0;

	List<Course> enrolledCourses = new ArrayList<>();

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		if (gender.equals("male")) {
			iGender = 1;
		} else if (gender.equals("female")) {
			iGender = 2;
		} else if (gender.equals("transgender")) {
			iGender = 3;
		}
		
		if (iGender == 0) {
			throw new IllegalArgumentException("Invalid gender!!");			
		} else {
			this.gender = gender;
		}
		
	}


	public Student(String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree) {
		this(newName, newGender, newAge, newPhone, newGpa, newDegree, false);
	}

			
	public Student(String name, String gender, int age, long phone, double gpa, char degree, boolean international) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.gpa = gpa;
		this.degree = degree;
		this.international = international;

		studentCount = studentCount + 1;
		int nextId = id + 1;
		
		if (international) {
			tuitionFees = tuitionFees + internationalFees;
			// return;
		}

		System.out.println("\nid: " + this.id);
		System.out.println("nextId: " + nextId);
		System.out.println("name: " + this.name);
		System.out.println("gender: " + this.gender);
		System.out.println("age: " + this.age);
		System.out.println("phone: " + this.phone);
		System.out.println("gpa: " + this.gpa);
		System.out.println("degree: " + this.degree);
		System.out.println("tuitionFees: " + tuitionFees);
		System.out.println("studentCount: " + studentCount);		
	}
	
	public Student() {	}
	
	public boolean updateProfile(String name) {
		this.name = name;
		return true;
	}

	public void enroll(Course course) {
		if (enrolledCourses.size() <= COURSE_ENROLL_LIMIT) {
			//if (enrolledCourses.size() < COURSE_ENROLL_LIMIT) {
			enrolledCourses.add(course);
		}
		printEnrolledCourses();
	}

	private void printEnrolledCourses() {
		for (Course course : enrolledCourses) {
			if (course.getDepartment() != null) {
				System.out.println("Course: " + course.getName() + ", Department: " + course.getDepartment().getName());
			}
		}
	}
	
	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}
}