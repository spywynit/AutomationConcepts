package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
  @Test
  public void tc001() {
	  System.out.println("test method - tc001");
  }
  
  @Test
  public void tc002() {
	  System.out.println("test method - tc002");
  }
  
  @Test
  public void tc003() {
	  System.out.println("test method - tc003");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

}
