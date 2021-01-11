package Test_google;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGRadioButton {
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
  }
  
  
  @Test
  public void testRadioButton() {
	  driver.get("https://testautomation.co/webelements/");
	  List<WebElement> browserradios = driver.findElements(By.name("browser"));
	  //browserradios.get(1).click(); // dimulai dari 0, 1 karna nilai IE di web=1
	  for(WebElement radio:browserradios)
	  {
		  System.out.println(radio.getAttribute("value"));
		  if (radio.getAttribute("value").equals("firefox"))
		  {
			  radio.click();
		  }
		  
		  
			  
	  }
	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
	  
  }

}
