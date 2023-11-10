package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://subscribe.jawwy.tv/eg-en");
	}
	
	@AfterSuite
	public void stopDriver() {
		driver.quit();
	}

}
