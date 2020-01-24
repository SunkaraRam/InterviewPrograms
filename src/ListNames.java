
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListNames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		 
		int lennum = driver.findElement(By.id("u_0_q")).getSize().getHeight();
		
		String name =driver.findElement(By.tagName("img")).getAttribute("src");
		 
		System.out.println("Path of the SRc =" + name);
		
		System.out.println(lennum);
		//System.out.println(ram);
	}

}
