package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestCase {
	String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	WebDriver driver;
	
	String expectedTitle = "Web Order Login";
	String actualTitle = null;
	
  @BeforeTest
  public void init()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium Software\\Chrome-121\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get(baseUrl);
		
  }
  @Parameters({"username","passwd"})
  @Test
  public void validateHomePage(String uName, String pass) {
	  driver.findElement(By.id("ct100_mainContent_username")).sendKeys(uName);
	  driver.findElement(By.name("ct100$MainContent$password")).sendKeys(pass);
	  driver.findElement(By.className("button")).click();
	  
	  actualTitle = driver.getTitle().trim();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }

}
