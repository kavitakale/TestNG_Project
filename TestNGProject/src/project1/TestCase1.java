package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	WebDriver driver;
	
	String expectedTitle = "Web Order Login";
	String actualTitle = null;
	
  @Test
  public void validatePageTitle() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium Software\\Chrome-121\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get(baseUrl);
	  
	  actualTitle = driver.getTitle().trim();
	  System.out.println(actualTitle);
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.quit();
	  

  }
}
