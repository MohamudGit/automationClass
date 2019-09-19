package prioritizingTest;

import org.testng.annotations.Test;

import baseTest.SomeAPI;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG_Dependency {
	private SomeAPI calc;
	
  @Test(dependsOnMethods = {"test3"}, alwaysRun = true)
  public void test1() {
	  //test case logic
	  System.out.println("test1");
  }
  
  @Test(enabled = false)
  public void test2() {
	  //test case logic
	  System.out.println("test2");
  }
  
  @Test(timeOut = 1000)
  public void test3() throws Exception {
	  int result = calc.add(3, 5);
	  Assert.assertEquals(result, 8);
	  //test case logic
	  System.out.println("test3");
	  Thread.sleep(1001);
  }
  
  @Test(dependsOnMethods = {"test1"})
  public void test4() {
	  //test case logic
	  System.out.println("test4");
  }
  
  @BeforeClass
  public void beforeClass() {
	  //set up logic before class is run
	  System.out.println("beforeClass");
	  calc = new SomeAPI();
  }

  @AfterClass
  public void afterClass() {
	  //tear down logic after class is run
	  System.out.println("afterClass");
  }

}
