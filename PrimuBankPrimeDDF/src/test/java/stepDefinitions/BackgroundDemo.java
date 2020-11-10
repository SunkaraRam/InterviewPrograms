package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import CommonFun.PrimusHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundDemo {

	WebDriver driver;
	
	PrimusHomePage pg;

	@Given("^I launch application in Chromebrowser$")
	public void i_launch_application_in_Chromebrowser() throws Throwable {
	    
		driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
	}

	
	@Then("^I am creating object for loginHomepage$")
	public void i_am_creating_object_for_loginHomepage() throws Throwable {
		
		  pg = PageFactory.initElements(driver, PrimusHomePage.class);
	}

	
	@Then("^Application should be launch$")
	public void application_should_be_launch() throws Throwable {
	    
		String title= driver.getTitle();
		Assert.assertEquals("Primus BANK", title);
		
	}

	@When("^I Enter username$")
	public void i_Enter_username() throws Throwable {
		//driver.findElement(By.id("txtuId")).sendKeys("Admin");
	
		pg.uid.sendKeys("Admin");
		
	}

	@When("^I Enter password$")
	public void i_Enter_password() throws Throwable {
		//driver.findElement(By.id("txtPwordtxtuId")).sendKeys("Admin");
	
		pg.pwd.sendKeys("Admin");
	}
	
	@When("^I click on Loginbutton$")
	public void i_click_on_Loginbutton() throws Throwable {

		//driver.findElement(By.id("logintxtPwordtxtuId")).click();
		pg.lgn.click();
		
		
	}


	@Then("^I validate title of the Homepage$")
	public void i_validate_title_of_the_Homepage() throws Throwable {
	   
		String title= driver.getTitle();
		Assert.assertEquals("Primus BANK", title);
	}

	@Given("^I click on Users$")
	public void i_click_on_Users() throws Throwable {
	  
		driver.findElement(By.xpath("//a[@href='userdetails.aspx']")).click();
	}

	@Then("^I validate the UsersHomepage$")
	public void i_validate_the_UsersHomepage() throws Throwable {
	   
		if (driver.findElement(By.xpath("//span[@id='lab_101']")).isDisplayed()) {
			
			System.out.println("UserHome page Avilable");
		}
		else {
			System.out.println("UserHome page is not Avilable");
		}
	}

	@Given("^I click on Branches$")
	public void i_click_on_Branches() throws Throwable {

		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		
	}

	@Then("^I validate title of the BranchPage$")
	public void i_validate_title_of_the_BranchPage() throws Throwable {
	    
		if (driver.findElement(By.xpath("//span[@id='lab19']")).isDisplayed()) {
			
			System.out.println("BranchPage Avilable");
		}
		
	}

	
}