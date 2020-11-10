package PageVlidations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import reusableMethods.ExcelData;
import reusableMethods.JavaScriptLatest;
import reusableMethods.LaunchBrowser;

public class TestDemo{

	public WebDriver driver;
	@Test
	public void test1(){
		
	driver = 	LaunchBrowser.chromeStart(driver, "D:\\LatestDrivers\\chromedriver.exe", "https://www.flipkart.com/");

	WebElement el = driver.findElement(By.xpath("//div[@class='mCRfo9']/child::div/child::div/child::button"));

	JavaScriptLatest.highlightElement(driver, el);
		
	driver.findElement(By.xpath("//div[@class='mCRfo9']/child::div/child::div/child::button")).click();

		
		ExcelData ex = new ExcelData("D:\\SeleniumProjects\\PrimuBankPrimeDDF\\TestInputs\\InputSheet.xlsx");
		
		int row = ex.getRowNum("UserManagement");
		
		System.out.println(row);
		
		for (int i = 1; i <=row; i++) {
			
			String dt = ex.getData("UserManagement", i, 0);
			
			System.out.println(dt);
					
		}
	
		driver.close();
	}
}