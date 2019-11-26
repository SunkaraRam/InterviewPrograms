import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSrcData {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecho.driver", "d://gechodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("hyd");
		
		List<WebElement> cityname  = driver.findElements(By.xpath("//form/div[2]/div/div[2]/div[2]/ul/li"));

		int citynums = cityname.size();
		
		System.out.println(citynums);
		
		for (int i = 0; i < citynums; i++) {
			
			String link = cityname.get(i).getText();
			
			System.out.println(link);
			
		}
	}
}
