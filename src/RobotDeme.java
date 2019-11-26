import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotDeme {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://spreadsheetpage.com/index.php/file/king_james_bible/");
		
		driver.findElement(By.xpath("//section/div/div[1]/ul/li[3]/a"));
		
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		
		rbt.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		
//		rbt.keyPress(KeyEvent.VK_TAB);
//		
//		rbt.keyPress(KeyEvent.VK_TAB);
//		
//		rbt.keyPress(KeyEvent.VK_TAB);
//		
//		rbt.keyPress(KeyEvent.VK_ENTER); 
		
		
	}

}
