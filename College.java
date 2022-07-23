package org.college;

public class College {
	public void collegeName(String strCollegeName) {
		System.out.println("The name of the college is: "+strCollegeName);
	}
	//method overloading
	public void collegeName() {
		System.out.println("The college");
	}

	public void collegeCode(String strCode) {
		System.out.println("The code of the college is: "+strCode);
	}

	public void collegeRank(int intRank) {
		System.out.println("The rank of the college is: "+intRank);
	}
}

