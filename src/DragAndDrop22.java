import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop22 {

	public  String baseurl ="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
	
	public  WebDriver driver = new ChromeDriver();

	Actions act = new Actions(driver);
		
	public void openurl( ) {
		
		driver.get(baseurl);

		driver.manage().window().maximize();
		
		
	}
	
	public void scripT1() {
		
		
		driver.findElement(By.xpath("//div[@id='box2']"));

		WebElement source1 = driver.findElement(By.xpath("//div[@id='box2']"));
		
		WebElement targer1 = driver.findElement(By.xpath("//div[@id='box102']"));

		act.dragAndDrop(source1, targer1).perform();
		
	}
	
	public void scripT2() {
		
		WebElement source2 = driver.findElement(By.xpath("//div[@id='box5']"));
		
		WebElement targer2 = driver.findElement(By.xpath("//div[@id='box105']"));

		act.dragAndDrop(source2, targer2).perform();
			
		
	}
	
	public void scripT3() {
		
		WebElement source3 = driver.findElement(By.xpath("//div[@id='box6']"));
		
		WebElement targer3 = driver.findElement(By.xpath("//div[@id='box106']"));

		act.dragAndDrop(source3, targer3).perform();
			
		
	}
	
	public void scripT4() {
		
		WebElement source4 = driver.findElement(By.xpath("//div[@id='box1']"));
		
		WebElement targer4 = driver.findElement(By.xpath("//div[@id='box101']"));

		act.dragAndDrop(source4, targer4).perform();
			
		
	}
	
	public void scripT5() {
		
		WebElement source5 = driver.findElement(By.xpath("//div[@id='box3']"));
		
		WebElement targer5 = driver.findElement(By.xpath("//div[@id='box103']"));

		act.dragAndDrop(source5, targer5).perform();
			
		
	}
	
	public void scripT6() {
		
		WebElement source6 = driver.findElement(By.xpath("//div[@id='box7']"));
		
		WebElement targer6 = driver.findElement(By.xpath("//div[@id='box107']"));

		act.dragAndDrop(source6, targer6).perform();
			
		
	}

public void scripT7() {
		
		WebElement source7 = driver.findElement(By.xpath("//div[@id='box4']"));
		
		WebElement targer7= driver.findElement(By.xpath("//div[@id='box104']"));

		act.dragAndDrop(source7, targer7).perform();
			
		
	}
		
	public static void main(String[] args) {
		
		DragAndDrop22 dp = new DragAndDrop22();
		
		dp.openurl();
		
		dp.scripT1();
		
		dp.scripT2();
		
		dp.scripT3();
		
		dp.scripT4();
		
		dp.scripT5();
		
		dp.scripT6();
		
		dp.scripT7();
	}
	
	
	
	
}
