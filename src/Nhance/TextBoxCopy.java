package Nhance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TextBoxCopy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");;

		Actions act = new Actions(driver);
		
		Action seriesOfOperation = act.moveToElement(driver.findElement(By.id("txtuId"))).click().
				sendKeys(Keys.TAB,"Admin").build();
		
		seriesOfOperation.perform();

		driver.findElement(By.id("login")).click();

//		
//		act.sendKeys(Keys.ENTER).build().perform();

		
		
//		driver.findElement(By.id("txtuId")).sendKeys("Admin");;

		

	}

}
