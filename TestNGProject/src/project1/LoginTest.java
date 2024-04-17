package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium Software\\Chrome-123\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("your_username");
        loginPage.enterPassword("your_password");
        loginPage.clickLogin();

        // Add assertion or further test steps here
    }
}