package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	private WebDriver driver;
	private String url;
	
	public Utility(WebDriver driver, String url){
		this.driver = driver;
		this.url =url;
	}
	
	public void launchDeltaPage(){
		driver.get(this.url);
	}
	public void clickOnFlightStatusLink(By locator) {
		driver.findElement(locator).click();
		
	}
	public void fillflightNumberField(String flightNumber){
		driver.findElement(By.id("flightNo")).sendKeys(flightNumber);
	}
	public void fromCity(String fromCity, String partialText){
		
	WebElement departCity = driver.findElement(By.id("departcitylink"));
	departCity.click();
		
	WebElement searchFromCity = driver.findElement(By.id("search_input"));
	  searchFromCity.sendKeys(partialText);
	  
	  //grab all the cities and put them in list
	  List<WebElement> fromCities = driver.findElements(By.cssSelector("div.search-results>ul>li"));
	  
	  //iterate through the cities using for each loop
	  for(WebElement city: fromCities) {
		 // System.out.println(city.getText());
		  if(city.getText().equals(fromCity)){
			  city.click();
			  break;
		  }
	  }
	}
	
	
	
	public void toCity(String toCity, String partialText)
	{
		 WebElement arrivalCity = driver.findElement(By.id("arrivalcitylink"));
		  arrivalCity.click(); 
		  
		//partial fill from city text
		  WebElement arrivalToCity = driver.findElement(By.id("search_input"));
		  arrivalToCity.sendKeys(partialText);
		  
		//grab all the cities and put them in list
		  List<WebElement> toCities = driver.findElements(By.cssSelector("div.search-results>ul>li"));
		  
		//iterate through the cities using for each loop
		  for(WebElement city1: toCities) {
			  System.out.println(city1.getText());
			 if(city1.getText().equals(toCity)){
				 city1.click();
				 break;
				 
				 
			 }
		  }
	}
	public void clickSubmit()
	{
		driver.findElement(By.id("btn-flight-sts-submit")).click();
		
	}
	public String flightLinkText()
	{
		String text = driver.findElement(By.partialLinkText("DL4923")).getText();
		return text;
	}
	
}
