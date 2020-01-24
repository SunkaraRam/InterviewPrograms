import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnderLine {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/?gfe_rd=ctrl&amp;ei=bXAwU8jYN4W6iAf8zIDgDA&amp;gws_rd=cr");

		String CssValue1 = 	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/span[1]/center[1]/div[3]/div[1]/div[1]/a[1]")).getCssValue("text-decoration");
	
		System.out.println(CssValue1);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/span[1]/center[1]/div[3]/div[1]/div[1]/a[1]"))).perform();
		
		String CssValue2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[7]/span[1]/center[1]/div[3]/div[1]/div[1]/a[1]")).getCssValue("text-decoration");
		
		System.out.println(CssValue2);
	
	}

}
