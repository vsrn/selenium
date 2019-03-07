package example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest 
{

	WebDriver driver;

	@BeforeMethod
	public void browser()
	{
	 System.setProperty("webdriver.chrome.driver", "E:\\Share_File\\Selenium\\Chrome\\chromedriver.exe"); 
	 driver = new ChromeDriver(); 
	}
	
	
	@Test
	public void verifyHomePageTitle() {     

	    String BaseURL = "http://newtours.demoaut.com/";
	    driver.get(BaseURL);
	    String ExpectedTitle = "Welcome: Mercury Tours";
	    String ActualTitle = driver.getTitle();
	    AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
	    }
	
	@Test
	public void verifyLoginPage() {
	    driver.get("https://www.google.co.in/");    
	} 

	@AfterMethod
	public void close(){
	    driver.quit();
	    }
	
}
