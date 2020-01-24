package Legato;

import org.testng.annotations.Test;

public class StaticFinal {

	final String name1 = "ram";
	
	 String name="adf";
	
	 StaticFinal sf;
	@Test
	public void main() {
		
		sf = new StaticFinal();
		sf.name="sjuna";
		System.out.println(sf.name);
		
	}

	@Test
	public void main1() {
		sf = new StaticFinal();
		System.out.println(sf.name);
		
	}
	
}
