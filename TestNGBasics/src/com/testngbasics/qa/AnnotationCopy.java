package com.testngbasics.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationCopy {
  @Test
  public void Test1() {
	  System.out.println("Test 1 AnnotationCopy");
  }
  
  @Test
  public void Test2() {
	  System.out.println("Test 2 AnnotationCopy");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Its Before Methods of AnnotationCopy");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Its after method of AnnotationCopy");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class of AnnotationCopy");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class of AnnotationCopy");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test of AnnotationCopy");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test of AnnotationCopy");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suites of AnnotationCopy");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suites of AnnotationCopy");
  }

}
