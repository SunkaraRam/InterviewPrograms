import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();//FireFox
		driver.get("https://facebook.com");
		WebElement we = driver.findElement(By.id("loginbutton"));
		drawLine((JavascriptExecutor)driver, we);
	}
	
	public static void drawLine(JavascriptExecutor js, WebElement element) {
		js.executeScript("arguments[1].style.border='3px solid red'", element);
	}
}
