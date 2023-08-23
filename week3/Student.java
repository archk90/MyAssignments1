package org.student;


import org.department.Department;

public class Student {
	
	
	public void studentName() {
		
		System.out.println(" Name : Archana ");
		
	}
	
	public void studentdepartment() {
		
		System.out.println(" Department : ECE ");
		
	}
	
	public void studentid() {
		
		System.out.println(" id : 88092 ");
		
	}
	
	public static void main(String[] args) {
		
		
		Department obj = new Department();
		obj.collegeName(); //class college(superclass) extend to department(sub class)
		obj.collegeCode();
		obj.collegeRank();
		obj.depName();
		
		Student obj1 = new Student();
		obj1.studentName();
		obj1.studentdepartment();
		obj1.studentid();
		
		
		
	}
	
	

}
