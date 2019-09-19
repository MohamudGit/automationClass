package prioritizingTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Priority {
	
  @Test(priority = 3)
  public void test1() {
	  //test case logic
	  System.out.println("test1");
  }
  
  @Test(priority = 1)
  public void test2() {
	  //test case logic
	  System.out.println("test2");
  }
  
  @Test(priority = 0)
  public void test3() {
	  //test case logic
	  System.out.println("test3");
  }
  
  @Test(priority = 2)
  public void test4() {
	  //test case logic
	  System.out.println("test4");
  }
  
  @BeforeClass
  public void beforeClass() {
	  //set up logic before class is run
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  //tear down logic after class is run
	  System.out.println("afterClass");
  }

}
