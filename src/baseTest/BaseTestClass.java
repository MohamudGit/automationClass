package baseTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseTestClass {
  
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am beforeSuite in BaseTestClass");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am beforeTest inBaseTestClass");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("I am aftertest in BaseTestClass");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am beforeSuite in BaseTestClass");
  }

}
