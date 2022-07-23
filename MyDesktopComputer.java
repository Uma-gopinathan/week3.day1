package org.system;

//example for single inheritance
public class MyDesktopComputer extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDesktopComputer objComputer=new MyDesktopComputer();
		objComputer.computerModel("Toshiba");
		objComputer.desktopSize(15);
	}
	
	public void desktopSize(int intSize){
		 System.out.println("The desktop size in inches is: "+ intSize );
	 }

}
