package StagNagaShesu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\LatestDrivers\\chromedriver.exe");
		
		driver =  new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/flights/?gclid=CjwKCAiAi4fwBRBxEiwAEO8_Hl-61RaxzzVWfsp59JdSQ_QhCOP_NxppUprqqsto6fPmBlnnH920lBoCoIAQAvD_BwE&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!makemytrip&ef_id=CjwKCAiAi4fwBRBxEiwAEO8_Hl-61RaxzzVWfsp59JdSQ_QhCOP_NxppUprqqsto6fPmBlnnH920lBoCoIAQAvD_BwE:G:s");
	
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");
	
		driver.findElement(By.xpath("//p[text()='Rajiv Gandhi Intl Airport']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'To')]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bengaluru");
		
		driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		
		driver.findElement(By.xpath("//div[@class='dateInnerCell']/following::p[contains(text(),'28')][2]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Travellers & CLASS')]")).click();
		
		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();;
		
		driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();;
		
		driver.findElement(By.xpath("//li[@data-cy='infants-1']")).click();;
		
		driver.findElement(By.xpath("//li[@data-cy='travelClass-0']")).click();;
		
		driver.findElement(By.xpath("//button[@data-cy = 'travellerApplyBtn']")).click();
		
		
		driver.findElement(By.xpath("//p[@data-cy='submit']/child::a")).click();;
		
		////div[@class='fli-list one-way'][1]/following::span[@class='airways-name '][1]
		
		Thread.sleep(30000);
		
		List<WebElement> list =driver.findElements(By.xpath("//div[contains(@class,'one-way')]"));
		
		
		System.out.println(list.size());
		for (int i = 1; i <= list.size(); i++) {
			
		String flighname =	driver.findElement(By.xpath("//div[contains(@class,'one-way')]["+i+"]/descendant::span[@class='airways-name ']")).getText();
		
		System.out.println("flighname" + flighname);
			
		String time = driver.findElement(By.xpath("//div[contains(@class,'one-way')]["+i+"]/descendant::div[@class='dept-time']")).getText();
	
		System.out.println("time" + flighname);
		
		String city =driver.findElement(By.xpath("//div[contains(@class,'one-way')]["+i+"]/descendant::p[@class='dept-city']")).getText();
		
		System.out.println("city" + city);
		
		String price = driver.findElement(By.xpath("//div[contains(@class,'one-way')]["+i+"]/descendant::span[@class='actual-price']")).getText();
		
		System.out.println("price " + price);
		
		System.out.println("===========================================");
		}
		
		
	}

}
