package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTests {
	
  @Test
  public void tc001() {
	  
	  String expectedResult="courses12345";
	  String actualResult="courses";
	 
	  Assert.assertEquals(actualResult, expectedResult);
	  
	 
	  
  }
  
  @Test
  public void tc002() {
	  String expectedResult="courses12345";
	  String actualResult="courses";
	  
	  if(actualResult.equals(expectedResult)) { // false
		  System.out.println("pass");
	  }else {
		  System.out.println("testcase failed");
	  }
	  
  }
  
  @Test
  public void tc003() {
	  String expectedResult="courses12345";
	  String actualResult="courses";
	  
	  if(actualResult.equals(expectedResult)) { // false
		  System.out.println("pass");
		  
	  }else {
		 
		  Assert.fail("testcase failed");
	  }
	  
  }
  
  @Test
  public void tc004() {
	  String expectedResult="courses12345";
	  String actualResult="courses";
	  
	  if(actualResult.equals(expectedResult)) { // false
		  System.out.println("pass");
	  }else {
		  System.out.println("testcase failed");
	  }
	  
  }
  
  @Test
  public void tc005() {
	  String expectedResult="courses12345";
	  String actualResult="courses";
	  
	  if(actualResult.equals(expectedResult)) { // false
		  System.out.println("pass");
	  }else {
		  System.out.println("testcase failed");
	  }
	  
  }
}
