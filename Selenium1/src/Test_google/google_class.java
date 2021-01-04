package Test_google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//using ff
// import org.openqa.selenium.firefox.FirefoxDriver;

// using chrome
import org.openqa.selenium.chrome.ChromeDriver;


//using IE
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class google_class {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//using chrome
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//using IE
		//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		
		driver.get("https://www.google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.print("it's page source" + driver.getPageSource());
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Test Automation Java");
		WebElement SubmitSearch = driver.findElement(By.name("btnK"));
		SubmitSearch.submit();
		
		//driver.quit();
	}

}
