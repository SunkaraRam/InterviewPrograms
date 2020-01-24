package WindowHandleScroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHorizontal {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();

	
	driver.get("https://weather.com/en-IN/weather/5day/l/USID0011:1:US");
	Dimension d = new Dimension(521,628);
	driver.manage().window().setSize(d);
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	WebElement horizontal_scroll = driver.findElement(By.xpath("//div[@id='twc-scrollabe']/table"));
	JavascriptExecutor js = ((JavascriptExecutor)driver); 
	js.executeScript("arguments[0].scrollIntoView()", horizontal_scroll);

	}

}
