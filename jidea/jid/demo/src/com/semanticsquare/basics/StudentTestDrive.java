package com.semanticsquare.basics;

class StudentTestDrive {

	public static final int STUDENT_COUNT = 3;

	public static void main(String[] args) {
		
		Student student1 = new Student("Joan", "male", 18, 223_456_7890L, 3.8, 'B');
		 
		Student student2 = new Student("Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);
		
		Student student3 = new Student("Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);
        	
		System.out.println("\nStudent.studentCount: " + Student.studentCount);
		
		student1.updateProfile("John");
		System.out.println("Updated name of student1: " + student1.getName());
/*
		System.out.println("\nName of student1: " + student1.getName());
		System.out.println("Name of student2: " + student2.getName());
		System.out.println("Name of student3: " + student3.getName());
*/
		Student[] list = new Student[STUDENT_COUNT];
		list[0] = student1;
		list[1] = student2;
		list[2] = student3;

		for (Student student : list) {
			String name = student.getName();
			String gender = student.getGender();

			printNameAndGender(name, gender);
		}


		/*Student student4 = student1;
		  System.out.println("\nName of student4: " + student4.name);
		  
		  student4.updateProfile("Mike");
		  System.out.println("Name of student1: " + student1.name);
		
		  student4 = student2;
		  System.out.println("Name of student4: " + student4.name);
		
		  student2 = student1;
		  System.out.println("Name of student4: " + student4.name);
		  System.out.println("Name of student2: " + student2.name);
		
		  student4 = new Student();
		  student4.updateProfile("Alex");
		  System.out.println("Name of student4: " + student4.name);
		  System.out.println("Name of student2: " + student2.name);
		  System.out.println("Name of student1: " + student1.name);	  
		  
		  Student[] students = {student1, student2, student3};
		  
		  swap(students, 0, 2);
		  
		  System.out.println("\nName of student1: " + students[0].name);
		  System.out.println("Name of student2: " + students[1].name);
		  System.out.println("Name of student3: " + students[2].name);	

		*/

		Student[] students = {student1, student2, student3};

		swap(students, 0, 2);
	}

	private static void swap(Student[] students, int firstIndex, int secondIndex) {
		Student temp = students[firstIndex];
		students[firstIndex] = students[secondIndex];
		students[secondIndex] = temp;
	}

	private static void printNameAndGender(String name, String gender) {
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
	}

	/*
	static void swap(Student[] students, int firstIndex, int secondIndex) {
	      Student temp = students[firstIndex];
		  students[firstIndex] = students[secondIndex];
		  students[secondIndex] = temp;
	 }
     */
}