package CGI;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=-52)
	public void ACD() {
		System.out.println("This is First= -52");
	}
	@Test(priority=0)
	public void ACB(){
		
		System.out.println("This is Second-0");
		
	}

}
