package SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitsTask {
	//import static org.openqa.selenium.support.ui.ExpectedConditions.*;
  @Test
  public void f() throws Exception {
	  
	  ChromeDriver driver=new ChromeDriver();   //  chrome browseer
		
	  	driver.manage().window().maximize();  // maximizing
		
		 driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		 
		    driver.findElement(By.id("reveal")).click();  // half second -- 500ms
		    
		  
		    
		    // wait for element visible
		    WebElement revealed = driver.findElement(By.id("revealed"));
		    
		    
		    // for every 500 ms
		    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		    
		    wait.until(ExpectedConditions.elementToBeClickable(revealed));
		    
		    
		    
		    revealed.sendKeys("Displayed");
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    

		   /* Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("revealed")));
		    //wait.until(d -> revealed.isDisplayed());

		    
		    Assert.assertEquals("Displayed", revealed.getDomProperty("value"));*/
  }
}
