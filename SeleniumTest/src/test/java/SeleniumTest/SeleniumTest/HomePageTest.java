package SeleniumTest.SeleniumTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");		
	}
	
	
	@Test
	public void testHomePageLinks() {
		HomePage objHomePage= new HomePage(driver);
		objHomePage.verifylinksonHomePage();		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
	
	

}
