package com.testngbasics.qa;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation {
  @Test
  public void Test1() {
	  System.out.println("Test 1");
  }
  
  @Test()
  public void Test2() {
	  System.out.println("Test 2");
	  Reporter.log("Here test case of annotation is executing" );
  }
  
  @Test()
  public void Test3() {
	  System.out.println("Test 2");
	  Reporter.log("Reading ....." );
  }
  
  @Test()
  public void Test4() {
	  System.out.println("Test 2");
	  Reporter.log("Closing ........." );
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Its Before Methods");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Its after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suites");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suites");
  }

}
