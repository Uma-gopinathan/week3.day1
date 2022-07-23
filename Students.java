package org.student;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students studentObj = new Students();
		studentObj.getStudentInfo(34567);
		studentObj.getStudentInfo(34567, "Bob");
		studentObj.getStudentInfo("bob34@ymail.com",989876564);
	}
	
	public static void getStudentInfo(int intStudentID) {
		System.out.println("The student id is: "+intStudentID);
	}
	public static void getStudentInfo(int intstudentID,String strstudentName) {
		System.out.println("The student id is: "+intstudentID);
		System.out.println("The student name is: "+strstudentName);
	}
	public static void getStudentInfo(String strEmail,long PhoneNumber) {
		System.out.println("The student email is: "+strEmail);
		System.out.println("The student phone number is: "+PhoneNumber);
	}
	
}
