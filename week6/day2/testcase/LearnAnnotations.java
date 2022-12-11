package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations {
  @Test
  public void method2() {
	  System.out.println("Test1");
  }
  
  @Test
  public void method1() {
	  System.out.println("Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BM");
  }
  
  @BeforeMethod
  public void beforeMethod2() {
	  System.out.println("BM2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AM");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BC");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BS");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AC");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BT");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AT");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AS");
  }

}
