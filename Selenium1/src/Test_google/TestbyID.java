package Test_google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestbyID {

	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void testId() {
		driver.get("https://testautomation.co/webelements/");
		WebElement name = driver.findElement(By.id("legalname"));
		name.sendKeys("jane lulu");
		name.clear();
		name.sendKeys("jane doe lalala");
	
		
	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}

}
