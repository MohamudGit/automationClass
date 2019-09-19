package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args)
	{
		//the ways to locate an element on ui 
		//id, name, linktext, partialLinkText, cassname, css, xpath
		//id, css, xpath - most used
		//when locating an element on the ui, the element has to be unigue
		// ul means unordered list
		//li means list
		
		//finding element by id
		

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6410\\Downloads\\chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	//id = u_0_e
	//step 1
	//find input text field using the id
	//step 2
	//enter text
	
	// //a[text() = 'Create a Page']
	// //a[contains(text(), 'Create a')]
	// //button[@class = ('_6j mvm _6wk _6wl _58mi _3ma _6o _6v')]
	
	driver.findElement(By.id("u_0_e")).sendKeys("Mohamud");
	//by name 
	driver.findElement(By.name("lastname")).sendKeys("Mohamud");
	//by linktext, always an achor tag (a tag)
	//driver.findElement(By.linkText("Create a Page")).click();
	//by partialLinkText
	//driver.findElement(By.partialLinkText("Create a ")).click();
	
	//by class name
	//driver.findElement(By.className(" _6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();
	driver.findElement(By.id("u_0_y")).click();
	
	
	
	
	
	}
	
}
