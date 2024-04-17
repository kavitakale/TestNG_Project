package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class AmazonChromeAutomation {

    public static final String SELENIUM_GRID_URL = "http://localhost:4444/wd/hub";

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium Software\\Chrome-123\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

      //  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
       // WebDriver driver = new RemoteWebDriver(new URL(SELENIUM_GRID_URL), capabilities);
        testAmazon(driver, "Chrome");
        driver.quit();
    }

    public static void testAmazon(WebDriver driver, String browser) {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Amazon.com : Laptop")) {
            System.out.println("Search functionality is working fine on " + browser);
        } else {
            System.out.println("Search functionality is not working on " + browser);
        }
    }
}
