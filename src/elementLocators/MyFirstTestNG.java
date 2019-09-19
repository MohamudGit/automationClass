package elementLocators;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;

public class MyFirstTestNG {
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beoforeMethod() is run");
  }
  
  @Test
  public void testCase1() 
  {
	  System.out.println("testCase1() is run");
  }
  
  @Test
  public void testCase2() 
  {
	  System.out.println("testCase1() is run");
  }
  
  @Test
  public void testCase3() 
  {
	  System.out.println("testCase1() is run");
  }
  

  @AfterMethod
  public void afterMethod()
{
	  System.out.println("beoforeMethod() is run");
  }

//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }

}
