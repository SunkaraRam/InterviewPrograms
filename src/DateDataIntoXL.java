import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DateDataIntoXL 

	{
	
		public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://cleartrip.com");
		
		driver.findElement(By.id("DepartDate")).click();
		
		WebElement table;
		
		table =  driver.findElement(By.xpath("/html/body/div[1]/div[1]/table"));
		
		List<WebElement> rows ,cols;
		
		rows = table.findElements(By.tagName("tr"));
		
		for (int i = 1; i <rows.size(); i++) {
			
			cols = rows.get(i).findElements(By.tagName("td"));
//			String name = cols.get(i).getText();
//			System.out.println(name);
			
			System.out.println();
			for (int j = 0; j < cols.size(); j++) {
				String data1 = cols.get(j).getText();
				System.out.print(data1+" ");
				XLUnits.setCellData("d://DateData.xlsx","Can", i, j, data1);
		
				
			}
			
			
		}
			
				
//				for (int j = 0 ; j <cols.size() ; j++) {
//				
//					
//					XLUnits.setCellData("d://DateData.xlsx","Can", 0, j, data1);
//					
//				}
				
				
				
				//FileOutputStream fo = new FileOutputStream("d://Datedata.xlsx");
				
			   
			
					
			
	

	/*
	public static String date="15/08/2019";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://cleartrip.com");
		
		driver.findElement(By.id("DepartDate")).click();
		
		String expyear,actyear;
		
		expyear = "2020";
		
		actyear = driver.findElement(By.className("ui-datepicker-year")).getText();

		
		while (!actyear.toLowerCase().equalsIgnoreCase(expyear)) {
			
			driver.findElement(By.className("nextMonth ")).click();
			
			actyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}

		driver.findElement(By.className("ui-datepicker-month"));
		
		String expmnth,actmnth;
		
		expmnth = "May";
		
		actmnth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!actmnth.toLowerCase().equalsIgnoreCase(expmnth)) {
			
			driver.findElement(By.className("nextMonth ")).click();
			
			actmnth = driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		
		String expdt,actdt;
		
		expdt = "20";
		
		WebElement table;
		
		table =  driver.findElement(By.className("calendar"));
		
		List<WebElement> rows,cols;
		
		rows = table.findElements(By.tagName("tr"));
		
		int rnum = rows.size();
		
		//System.out.println(rnum);
		
		for (int i = 1; i < rnum; i++) {
			
			cols = rows.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < cols.size(); j++) {
			
				String coldata = cols.get(j).getText();
				
				if (coldata.toLowerCase().equalsIgnoreCase(expdt.toLowerCase())) {
					
					cols.get(j).click();
					
				}
				
			} 
			
			
		}
		
		}
		
	*/

	
	}
}
