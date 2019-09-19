package elementLocators;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FormyFormTest 
{
	//declaring driver instance variable
 private WebDriver driver;
 //declaring my url variable
 private String url;
	
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6410\\Downloads\\chromedriver_win32//chromedriver.exe");
	  url = "https://formy-project.herokuapp.com/form";
	  
	  //instantiate my driver
	  driver = new ChromeDriver();
	  //Maximize windows
	  driver.manage().window().maximize();
	  //set timeout
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }
  
  
  @Test
  public void testCase1() throws Exception 
  {
	  //launch browser
	  driver.get(url);
	  
	  String expectedText = "The form was successfully submitted!";
	  
	  //fill out the first name text field
	  WebElement firstNameField = driver.findElement(By.id("first-name"));
	  firstNameField.sendKeys("Mohamud");
	  //fill out the last name text field
	  WebElement lastNameField = driver.findElement(By.id("last-name"));
	  lastNameField.sendKeys("Ahmed");
	//fill out the job title text field
	  WebElement jobTitleField = driver.findElement(By.id("job-title"));
	  jobTitleField.sendKeys("Automation Engineer");
	  //fill out the Highest level of education
	  WebElement educationLevelRadioBtn = driver.findElement(By.id("radio-button-2"));
	  educationLevelRadioBtn.click();
	  //fill out Sex checkbox
	  WebElement SexCheckBox = driver.findElement(By.id("checkbox-1"));
	  SexCheckBox.click();
	  //select years of experience selection
	  WebElement dropDownElement = driver.findElement(By.id("select-menu"));
	  Select options = new Select(dropDownElement);
	  //options.selectByIndex(4);
	  options.selectByValue("4");
	  //Pick a date
	  WebElement datePicker = driver.findElement(By.id("datepicker"));
	  datePicker.click();
	  
	  //print all the dates to console
	  List<WebElement> dates = driver.findElements(By.xpath("//div[@class='datepicker-days']//td"));
	  //using for loop lets print all dates
	  //date is iterator
	  for (WebElement date : dates) {
		  //System.out.println(date.getText());
		  if (date.getText().equals("23")) {
			  date.click();
			  break;
		  }
	  }
	  
	  Thread.sleep(3000);
	  //click on the submit button
	  WebElement submitBtn = driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']"));
	  submitBtn.click();
	  
	  WebElement successElement = driver.findElement(By.cssSelector("div.alert"));
	  String actualText = successElement.getText();
	  System.out.println("Printed text is: "+ actualText);
	  
	  Assert.assertEquals(expectedText, actualText);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
