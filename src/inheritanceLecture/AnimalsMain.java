package inheritanceLecture;

public class AnimalsMain {

	public static void main(String[] args) {
		// instantiate Animal class
		//is calling empty constructor
	   Animals animal = new Animals();
	   
	   animal.eat();
	   
	   animal.move();
	   
	   Cat cat = new Cat("Kat Stevens", "gray");
	   
	   String catName = cat.getName();
	   System.out.println(catName);
	   
	   cat.move();
	}
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\E6410\\Downloads\\chromedriver_win32//chromedriver.exe");

}
