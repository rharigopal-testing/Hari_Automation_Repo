package testbase;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TestScrpts{

	WebDriver driver;
	
	@BeforeTest
	public void setup(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Entered browser name is wrong, please check!");
			break;
		}
	}

	@Test(priority = 1)
	public void testLaunchUrl(String url) {

		driver.get(url);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"standard_user", "secret_sauce"},   // valid
            };
    }
	
	
	@Test(priority = 2,dataProvider = "loginData")
	public void testLogin(String username, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickLogin();
		System.out.println("Test executed with -> " + username + " / " + password);
		
    }
	

	@AfterTest
	public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
}
}
