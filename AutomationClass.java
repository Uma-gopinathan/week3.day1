package Abstraction;

public class AutomationClass extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is a concrete class, should not have unimplemented methods
		AutomationClass objAutomation=new AutomationClass();
		objAutomation.Selenium();
		objAutomation.Java();
		//call to implemented method in abstract class
		objAutomation.python();
		objAutomation.ruby();
	}

	//method from Language interface implemented here
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("This is Selenium:  implemented in concrete class");
	}
	//method from TestTool interface implemented here
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("This is Java: implemented in concrete class");
	}

	//unimplemented method from abstract class MultipleLanguage - implemented here
	public void ruby() {
		System.out.println("This is ruby:  implemented in concrete class");
	}

}



}
