import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class LoadTesting {

//	@Test(invocationCount=10)
//	
//	public void mload() {
//		
//		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
//		
//		WebDriver driver=  new ChromeDriver();
//		
//		driver.get("http://flipkart.com");
//		
//		driver.close();
//	}

	@Test
public void security() {
	
	System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
	
	WebDriver driver=  new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://gmail.com");
	
	driver.findElement(By.id("identifierId")).sendKeys("sunkararam1166@gmail.com");;
	
	driver.findElement(By.className("CwaK9")).click();
	
	String pwd = driver.findElement(By.name("password")).getAttribute("type");
	
	System.out.println(pwd);
	
	if (true==true) {
		Assert.assertEquals("password", "passwor");
		
		System.out.println("Test Pass");
	} else {

	System.out.println("Test Fail");
	}
}



}
