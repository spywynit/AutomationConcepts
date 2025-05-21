package SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FluentWaitTask {
  @Test
  public void f() {
	  
	  WebDriver driver=new ChromeDriver();   //  chrome browseer
		
	  	driver.manage().window().maximize();  // maximizing
	  
	  driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
	    WebElement revealed = driver.findElement(By.id("revealed"));
	    driver.findElement(By.id("reveal")).click();
	    
	    FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	   
		wait.withTimeout(Duration.ofSeconds(2));
		wait.pollingEvery(Duration.ofMillis(300));
		wait.ignoring(ElementNotInteractableException.class);


	    wait.until(
	        d -> {
	          revealed.sendKeys("Displayed");
	          return true;
	        });

	    Assert.assertEquals("Displayed", revealed.getDomProperty("value"));
  }
}
