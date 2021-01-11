package Test_google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestbyXpath {
	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void byXpath() {
		driver.get("https://testautomation.co/webelements/");
		//driver.findElement(By.xpath("//*[@id=\"formsubmit\"]/table/tbody/tr[8]/td[1]/input")).click();
		
		// simple xpath
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

	}

	@AfterMethod
	public void afterMethod() {
		
		//driver.quit();
	}

}
