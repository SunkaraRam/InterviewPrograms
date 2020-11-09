package SurenPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\LatestDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("RamSunkara");
		
		Thread.sleep(5000);
		
		List<WebElement> options = driver.findElements(By.xpath("//li//div[1]//div[2]//div[1]//span[1]"));
		
		for (int i = 1; i < options.size(); i++) {
			
			String option = driver.findElement(By.xpath("//li["+i+"]//div[1]//div[2]//div[1]//span[1]")).getText();
			
					System.out.println(option);
			
		}
		driver.close();//This is driver.close();
		
		
	}
	
}