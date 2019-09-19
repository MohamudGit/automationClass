package deltaPage;

import org.testng.annotations.Test;

import utilities.Utility;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DeltaPageTest {
	private WebDriver driver;
	private String url;
	private Utility um;
	
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6410\\Downloads\\chromedriver_win32//chromedriver.exe");
	  driver = new ChromeDriver();
	  url = "https://www.delta.com";
	  
	  um = new Utility(driver, url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }
  
 // @Test
  public void flightStatusTest() throws IOException, Exception {
	  String fromCityPartialtext = "Min";
	  String arrivalCityPartialText = "Det";
	  String fromCityText = "MSP\nMinneapolis/St Paul, MN";
	  String arrivalCityText = "DTW\nDetroit, MI";
	  String expectedResult = "DL1582";
	  
	  //launch the browser
	  driver.get(url);
	  
	  //click on the flight status link
	  WebElement flightStatusLink = driver.findElement(By.cssSelector("a.nav-link-flightstatus"));
	  flightStatusLink.click();
	  
	  //fill flightnumber, 1049
	  WebElement flightNumber = driver.findElement(By.id("flightNo"));
	  flightNumber.sendKeys("1049");
	  
	  //Auto fill from city field
	  WebElement departCity = driver.findElement(By.id("departcitylink"));
	  departCity.click();
	  
	  //partial fill from city text
	  WebElement searchFromCity = driver.findElement(By.id("search_input"));
	  searchFromCity.sendKeys(fromCityPartialtext);
	  
	  //grab all the cities and put them in list
	  List<WebElement> fromCities = driver.findElements(By.cssSelector("div.search-results>ul>li"));
	  
	  //iterate through the cities using for each loop
	  for(WebElement city: fromCities) {
		 // System.out.println(city.getText());
		  if(city.getText().equals(fromCityText)){
			  city.click();
			  break;
		  }
	  }
		  
		  
		  
		  WebElement arrivalCity = driver.findElement(By.id("arrivalcitylink"));
		  arrivalCity.click(); 
		  
		//partial fill from city text
		  WebElement arrivalToCity = driver.findElement(By.id("search_input"));
		  arrivalToCity.sendKeys(arrivalCityPartialText);
		  
		//grab all the cities and put them in list
		  List<WebElement> toCities = driver.findElements(By.cssSelector("div.search-results>ul>li"));
		  
		//iterate through the cities using for each loop
		  for(WebElement city1: toCities) {
			  System.out.println(city1.getText());
			 if(city1.getText().equals(arrivalCityText)){
				 city1.click();
				 break;
				 
				 
			 }
		  }
		   //click
		  WebElement submitFlightStsBtn = driver.findElement(By.id("btn-flight-sts-submit"));	 
			submitFlightStsBtn.click();
			
			//verify of flight number DL1582
			//find the element
			//get text
			//print the text
			WebElement flightLink = driver.findElement(By.partialLinkText("DL1582"));
			String actualResult = flightLink.getText();
			System.out.println(actualResult);
			
			//screenshot
			//create a filename with extention.png
			
			//move into element
			Actions action = new Actions(driver);
			
			Thread.sleep(2000);
			action.moveToElement(flightLink).build().perform();
			Thread.sleep(2000);
			
			String filename = "afterSubmit.png";
			//create directory
			
			String directory = "C:\\Users\\E6410\\Desktop\\Screenshots\\" + filename;
			
			File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(sourceFile, new File(directory));
			
			//use assert to pass or fail test
			Assert.assertEquals(expectedResult, actualResult);
		  
	  
  }

  @Test
  public void flightStatusTestUsingUtil() throws Exception {
	  String expectedText = "DL4923\n1";
	  String flightNumber = "1049";
	  um.launchDeltaPage();
	  um.clickOnFlightStatusLink(By.cssSelector("a.nav-link-flightstatus"));
	  um.fillflightNumberField(flightNumber);
	  um.fromCity("MSP\nMinneapolis/St Paul, MN", "Min");
	  
	  Thread.sleep(2000);
	  um.fromCity("NYC\nNew York City Area Airports, NY", "New");
	  um.toCity("DTW\nDetroit, MI", "Det");
	  um.clickSubmit();
	  String actualText = um.flightLinkText();
	  //print result
	  System.out.println("Actual Text: " + actualText);
	  Assert.assertEquals(expectedText, actualText);
	  
  }
  @AfterMethod
  public void afterMethod() throws Exception {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
