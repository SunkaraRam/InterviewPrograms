package InterfacePackage;

public class DemoClass implements FirstInterface ,SecondInterface {

	public static void main(String[] args) {

		DemoClass dc = new DemoClass();
		
		dc.mySecondMethod();
		
		dc.myFirstmethod();
		
	}

	@Override
	public void mySecondMethod() {
		
		System.out.println("My second method Executed");
	}

	@Override
	public void myFirstmethod() {
		
		System.out.println("My First Method Executed");

	}

}
