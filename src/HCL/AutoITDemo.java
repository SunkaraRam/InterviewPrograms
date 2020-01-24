package HCL;

import java.io.IOException;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AutoITDemo {
    public static void main(String[] args) throws IOException {
        
    	WebDriver driver;
    	
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    	
    	DesiredCapabilities dc = new DesiredCapabilities();
    	dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
    	
        driver = new ChromeDriver();
        
        driver.manage().deleteAllCookies();
        
        driver.manage().window().maximize();
        
        driver.get("http://demo.guru99.com/test/basic_auth.php");
        //Passing the AutoIt Script to Selenium	
        //Runtime.getRuntime().exec("D:\\Data_Personal\\ProxyAuthentication.exe");
    
        
//        driver.switchTo().alert().sendKeys("guru99");
//        
//        driver.switchTo().alert().accept();
//        
//        driver.switchTo().alert().sendKeys("guru99");
//        
//        driver.switchTo().alert().accept();
    
    }
}