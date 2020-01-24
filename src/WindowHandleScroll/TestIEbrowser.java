package WindowHandleScroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIEbrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\IEDriverServer.exe");
		
		WebDriver driver= new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/admin/viewSystemUsers");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		
		driver.findElement(By.id("btnLogin")).click();
	}

}
