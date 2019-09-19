package elementLocators;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Targetest {
	
	private WebDriver driver;
	private String url;
  
  @BeforeMethod
  public void beforeMethod() 
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6410\\Downloads\\chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	url = "https://www.target.com";
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	driver.manage().window().maximize();
  }
  
  
  
  @Test
  public void DealsLink() 
  {
	  driver.get(url);
	  WebElement dealsLink = driver.findElement(By.id("secondary"));
	  dealsLink.click();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.close();
  }

}
