package InterfacePackage;

public class Pig implements Animal{

	@Override
	public void animaSound() {
		
		System.out.println("The pig says :wee wee");
		
	}

	@Override
	public void sleep() {
		
		System.out.println("Zzz");
		
	}

	
	
}

