package HCL;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import reusableMethods.JavaScriptLatest;
import reusableMethods.LaunchBrowser;
import reusableMethods.UtilitiesRS;

public class AuthenticationPopupHandle {

	public static WebDriver driver;
	
	@BeforeMethod
	public void beforeMethodDemo() {
		
		//System.out.println("This is Before Method");
		
		driver = LaunchBrowser.chromeStart(driver, "d://latestDrivers//chromedriver.exe", "http://primusbank.qedgetech.com/");
		
		
		
	}
	
	@Test(priority=1)
	public void international() {
		
//		JavaScriptLatest.highlightElement(driver, driver.findElement(By.xpath("//input[@id='NRI']")));
//		Assert.assertEquals(false,driver.findElement(By.xpath("//input[@id='NRI']")).isDisplayed());
		
		try {
			JavaScriptLatest.highlightElement(driver, driver.findElement(By.xpath("//input[@id='NRI']")));
			Assert.assertEquals(false,driver.findElement(By.xpath("//input[@id='NRI']")).isDisplayed());
		
		} catch (Exception e) {
			
			JavaScriptLatest.highlightElement(driver, driver.findElement(By.xpath("//input[@id='NRI']")));
		}
		
		
	}
	@Test(priority=2)
	public void corporate() {
	
		
//		JavaScriptLatest.highlightElement(driver, driver.findElement(By.xpath("//input[@id='corporate']")));
//		Assert.assertEquals(false, driver.findElement(By.xpath("//input[@id='corporate']")).isDisplayed());
		try {
			JavaScriptLatest.highlightElement(driver, driver.findElement(By.xpath("//input[@id='corporate']")));
			Assert.assertEquals(false, driver.findElement(By.xpath("//input[@id='corporate']")).isDisplayed());

		}catch (Exception e) {
			
			JavaScriptLatest.highlightElement(driver, driver.findElement(By.xpath("//input[@id='corporate']")));
			
		}
	
	}
	
	@Test(priority=3)
	public void personal() {
		
		Assert.assertEquals(true, driver.findElement(By.xpath("//input[@id='personal']")).isDisplayed());
		
	}
	
	
	@Test(priority=4)
	public void logOut() {
		
		Assert.assertEquals(true,driver.findElement(By.xpath("//a[@href='aboutus.html']")).isDisplayed());
		
	}
	@AfterMethod
	public void afterMethodDemo(ITestResult result) throws IOException {
		
		if (result.getStatus()==ITestResult.FAILURE) {
			
			UtilitiesRS.captureScreen(driver, "D:\\SeleniumProjects\\InterviewPrograms\\src\\HCL\\", result.getName());
		
		}
		
		System.out.println("This is After Method");
		
		driver.close();
	}
	
	
//	public static void main(String[] args) {
//		
//		driver = LaunchBrowser.chromeStart(driver, "d://LatestDrivers//chromedriver.exe", "https://admin:admin@the-internet.herokuapp.com/basic_auth");
//	
//		String conf = driver.findElement(By.cssSelector("p")).getText();
//		
//		UtilitiesRS.captureScreen(driver, "", filename)
//		
//		System.out.println(conf);
		
//	}

}
