package SourabhTiwari;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollbyTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Dimension d = new Dimension(1000, 1000);
		
		driver.manage().window().setSize(d);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		
		  
		//Method 1
		
		//JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		//js.executeScript("window.scrollBy(0,1500)");
		
		
		
		//Method2
//		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		
//		WebElement redmi = driver.findElement(By.xpath("//a[text()='Google Pixel 3A']"));
//		
//		js.executeScript("arguments[0].scrollIntoView();", redmi);
//		
		
		//Metho3 
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		
		Actions act = new Actions(driver);
		
		WebElement check = driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
		
		act.contextClick(check).build().perform();
			
		Thread.sleep(5000);
		
		WebElement prf = driver.findElement(By.linkText("YouTube"));
		
		act.doubleClick(prf).build().perform();
			
	}

}
