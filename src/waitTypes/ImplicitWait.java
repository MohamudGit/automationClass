package waitTypes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ImplicitWait 
{
	private WebDriver driver;
	private String url;
  
  @BeforeMethod
  public void beforeMethod() 
  	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6410\\Downloads\\chromedriver_win32//chromedriver.exe");
	  url = "https://formy-project.herokuapp.com";
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  
	  }
  
  @Test
  public void implicitWaitTest() {
	  driver.get(url);
	  //click on the web form element
	  WebElement webFormLink = driver.findElement(By.xpath("//a[@class = 'btn btn-lg'][contains(text(), 'Web Form')]"));
	  webFormLink.click();
	  //send the tex
	  driver.findElement(By.id("first-name")).sendKeys("Mohamud");
  }
  
  

  @AfterMethod
  public void afterMethod() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
