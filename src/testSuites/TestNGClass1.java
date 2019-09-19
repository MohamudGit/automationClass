package testSuites;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNGClass1 {
	
  @Test
  public void testMethod1() {
	  System.out.println("I am testMethod1 inside testNGClass1");
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("I am testMethod2 inside testNGClass1");
  }
  
  @Test
  public void testMethod3() {
	  System.out.println("I am testMethod3 inside testNGClass1");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am beforeMethod inside testNGClass1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am afterMethod inside testNGClass1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am beforeClass inside testNGClass1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am afterClass inside testNGClass1");
  }

}
