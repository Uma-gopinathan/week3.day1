package org.department;

import org.college.College;

public class Department extends College {
	public void deptName(String strDeptName) {
		System.out.println("The department name is: "+strDeptName);
	}
	
	//overriding method from parent class, no input parameters
	public void collegeName() {
		System.out.println("College name method call.Using method overloading.");
	}

}
