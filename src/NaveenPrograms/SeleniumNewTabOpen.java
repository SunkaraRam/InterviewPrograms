package NaveenPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumNewTabOpen {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "d://latestdrivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.id("txtuId")).click();
		
		//driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "n");
			
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL + "n");
		
	}

}
