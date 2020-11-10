package PageVlidations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.PrimusUtils;
import reusableMethods.ExcelData;
import reusableMethods.JavaScriptLatest;

public class PrimusTest {
		
	int count =1;
	@Test(dataProvider="getData")
	public  void test2(String uid,String pwd) throws Throwable {
		
		PrimusUtils pm = new PrimusUtils();

		System.out.println(uid+""+pwd);
					
			System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://primusbank.qedgetech.com");
			
			driver.findElement(By.id("txtuId")).sendKeys(uid);;
			
			driver.findElement(By.id("txtPword")).sendKeys(pwd);;

			driver.findElement(By.xpath("//input[@id='login']")).click();
			
			if (driver.findElement(By.xpath("//font[contains(text(),'Welcome')]")).isDisplayed()) {
				
				System.out.println("TestCase Pass");
				
				pm.setData("PrimusData", count, 3, "Pass");
			}
			
			else {
				System.out.println("TestCase Fail");
				pm.setData("PrimusData", 1, 3, "Fail");
			}

			
			//driver.close();
	}

	
	@DataProvider
	public Object[][] getData() throws Throwable {
		
		PrimusUtils pm = new PrimusUtils();
		
		int rowno = pm.rowCount("PrimusData");
		
		Object[][] data = new Object[rowno][2];
		
				
		System.out.println(rowno);
		
		for (int i = 1; i <= rowno; i++) {
			
		
			data[i-1][0]= pm.getData("PrimusData", i,0);
			
			data[i-1][1]= pm.getData("PrimusData", i,1);
			
		}
		count++;
		
		return data;
	}
	
//	public static void main(String[] args) throws Throwable {
//		
//		PrimusUtils pm = new PrimusUtils();
//		
//		int rowno = pm.rowCount("PrimusData");
//		
//		System.out.println(rowno);
//		
//	}
	
}
