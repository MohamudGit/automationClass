package interfaceLecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnimalsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAnimalsBehavior bobi = new Dog("Bobi");
		IAnimalsBehavior nimo = new Fish("Nimo");
		
		nimo.eat();
		bobi.eat();
		
		//abstract classes
		//abstract class will combine implemented and unimplemented method
		
		//by Monday download jar files
		//google UI automation engineer

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6410\\Downloads\\chromedriver_win32//chromedriver.exe");
	
	//Webdriver is interface. chromedriver is congrete class that implements the webdriver interface
	//to download firefox, you need to download gecco driver
	WebDriver driver = new ChromeDriver();
	
	//we want to launch google.com using chrome browser
	driver.get("https://www.google.com/");
	driver.get("https://www.facebook.com/");
	}
}
