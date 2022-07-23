package org.student;

import org.department.Department;

public class Student extends Department {
	public static void main(String[] args) {
		Student objStudent = new Student();
		objStudent.collegeCode("55678FG");
		objStudent.collegeName("Anna University");
		objStudent.collegeName();
		//Calling the overridden method
		objStudent.collegeName();
		objStudent.collegeRank(1);
		//calling the overloaded method
		objStudent.deptName("Computer Science");
		objStudent.studentDepartment();
		objStudent.studentDepartment("CSC");
		objStudent.studentName("Uma");
		objStudent.studentId("CS0034");	
		
	}
	
	public void studentName(String strStudentName) {
		System.out.println("The name of the student is: "+ strStudentName);
	}
	public void studentDepartment() {
		System.out.println("The name of the department is: ");
	}
	//method overloading
	public void studentDepartment(String strDepartmentName) {
		System.out.println(strDepartmentName);
	}
	public void studentId(String intStudentId) {
		System.out.println("The id of the student is: "+ intStudentId);
	}
}

