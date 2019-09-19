package waitTypes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ExplicitWait {
	private WebDriver driver;
	private String url;
	
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6410\\Downloads\\chromedriver_win32//chromedriver.exe");
	  url = "https://formy-project.herokuapp.com";
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
  }
  
  //--most commonly used
  //elementToBeClickable
  //presenceOfElementLocated
  //visibilityOfElementLocated
  
  @Test
  public void explicitWait() {
	  driver.get(url);
	  //click on the web form element
	  WebElement webFormLink = driver.findElement(By.xpath("//a[@class = 'btn btn-lg'][contains(text(), 'Web Form')]"));
	  webFormLink.click();
	  WebDriverWait wait = new WebDriverWait(driver, 3);
	  WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
	  nameField.sendKeys("Mohamud");
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
