package Test_google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class testbyName {
	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void Testbyname() {
		driver.get("https://testautomation.co/webelements/");
		//driver.findElement(By.name("yourname")).sendKeys("jane");
		
		//kalo punya nama yg sama
		List<WebElement> names = driver.findElements(By.name("yourname"));
		names.get(0).sendKeys("jane");
		names.get(1).sendKeys("jennie");
	}

	@AfterMethod
	public void afterMethod() {
		// driver.quit();
	}

}
