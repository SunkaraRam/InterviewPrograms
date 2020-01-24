package SourabhTiwari;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Axesfilters {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://ankpro.com/");
		
		WebElement al = driver.findElement(By.xpath("//h2/following::p"));
	
		JavascriptExecutor js = ((JavascriptExecutor)driver);
	

		//js.executeScript("arguments[0].style.border = '3px solid red'",al);
		
		//JavascriptExecutor js = (driver(JavascriptExecutor));
		
		js.executeScript("arguments[0].style.border = '5px solid red'", al);
		
		String data = al.getText();
		
		System.out.println(data);
		
	}

}
