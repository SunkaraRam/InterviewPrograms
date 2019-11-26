package SourabhTiwari;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class InvocationTest {

	@Test(invocationCount=9,threadPoolSize=3)
	public  void loadTestThisWebsite() 
	{
		
		String urlweb = "http://www.google.com";
		
		System.out.println("This is url "+ urlweb);
		
		assertEquals("http://www.google.com", urlweb);
		
	}

}
