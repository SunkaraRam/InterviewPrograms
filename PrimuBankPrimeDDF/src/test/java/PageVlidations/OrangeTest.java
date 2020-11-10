package PageVlidations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.OrangeUtils;

public class OrangeTest {

	
//	public static void main(String[] args) throws Throwable {
//		
//		OrangeUtils or = new OrangeUtils();
//		
//		int rowd = or.rowCount("Orange");
//		
//		System.out.println(rowd);
//	}
	 
	WebDriver driver;
	
	int count=1;
	
	@Test(dataProvider="getData")
	public void test1(String uid,String pwd) throws Throwable {
		
	
		OrangeUtils or =new OrangeUtils();
		System.out.println(uid +""+pwd);
		
		try {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		
		driver.findElement(By.id("btnLogin")).click();
		
		if (driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).isDisplayed()) {
			
			System.out.println("TestCasePass");
			
			or.setData("Orange", count, 3, "Pass");
		
		}
		
		} catch (Exception e) {
			
			or.setData("Orange", count, 3, "Fail");
			System.out.println("TestCasePass");
		
		}
		
		//driver.close();
	}
	
	@DataProvider
	public Object[][] getData() throws Throwable{
		
		OrangeUtils or = new OrangeUtils();
		
		int rowd = or.rowCount("Orange");
		
		System.out.println(rowd);
		
		Object data[][] = new Object[rowd][2];
		
		for (int i = 1; i <= rowd; i++) {
			
			data[i-1][0] = or.getData("Orange", i, 0);
			
			data[i-1][1] = or.getData("Orange", i, 1);
			
		}
		count ++;
		return data;
		
		
	}

}
