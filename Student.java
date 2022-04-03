package org.student;

import org.department.Department;

public class Student extends Department {

	//studentName(),studentDept(),studentId()
	
	public void studentName() {
		
		System.out.println("This is the student name from Student class");
		
	}
	
	public void studentDept() {
		
		System.out.println("This is the student Department from Student class");
		
	}
	
	
	public void studentId() {
		
		System.out.println("This is the student Id from Student class");
		
	}
	
	public  static void main(String args[]) {
		
		Student student = new Student();    // calling constructor of student class
		
		
		student.collegeName();   // college code can not be called here or by creating an object to College class because its declared as private
		student.collegeRank();
		student.deptName();
		student.studentDept();
		student.studentName();
		student.studentId();
		
		// the output also shows the Department class constructor output at top as in inheritance the constructor of parent class is called first
		//the college class methods can be accessed here because its parent/super class to department class which is a parent class to student class-multilevel inheritance
		
		
	}
	

	
}
