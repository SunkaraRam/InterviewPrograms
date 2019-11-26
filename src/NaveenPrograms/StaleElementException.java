package NaveenPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();	
		
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		
		
		driver.findElement(By.id("identifierId")).click();
		
	}

}
