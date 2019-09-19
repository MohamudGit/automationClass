package elementLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorsPart2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6410\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//maximize my window
		driver.manage().window().maximize();
		
		//manage wait time
		//implicit and explicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//find element by className, css, and xpath
		//launch browser
		String url = "https://formy-project.herokuapp.com/radiobutton";
		driver.get(url);
		
		//put a wait here
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='option2']")).click();
		
		//xpath... //tag[@Attribute='value']
		//
		//css...tag[Attribute='value'] = 
		//shortcut for css tagname.classname or tag#id
		
	}

}
