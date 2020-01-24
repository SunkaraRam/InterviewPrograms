package SourabhTiwari;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highleght {

	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Dimension d = new Dimension(1000, 1000);
		
		driver.manage().window().setSize(d);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		JavascriptExecutor js  = ((JavascriptExecutor)driver);
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Best Of Season Sale 2019']"));
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		//js.executeScript("window.scrollBy(0,1000)");
	
		js.executeScript("arguments[0].style.border = '3px solid green'",element);
		
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Google Pixel 3A XL']"));
		
		js.executeScript("arguments[0].style.border = '3px solid red'",element2);
		
	}
	
	

}