package testSuites;

import org.testng.annotations.Test;

import baseTest.BaseTestClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestClassAuto extends BaseTestClass  {
	
  @Test
  public void test1() {
	  System.out.println("I am test1 inside TestClassAuto");
  }
  
  @Test
  public void test2() {
	  System.out.println("I am test2 inside TestClassAuto");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am beforeMethod inside TestClassAuto");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am afterMethod inside TestClassAuto");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am beforeClass inside TestClassAuto");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am beforeClass inside TestClassAuto");
  }

}
