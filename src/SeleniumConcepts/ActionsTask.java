package SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTask {
  @Test
  public void f() throws Exception {
	  
	  ChromeDriver driver=new ChromeDriver();   //  chrome browseer
		
	  	driver.manage().window().maximize();  // maximizing
	  	
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	  	//https://www.selenium.dev/selenium/web/alerts.html
		
			driver.get("https://www.selenium.dev/selenium/web/");	
		//driver.get("https://practice.expandtesting.com/hovers");
		//Thread.sleep(10000);
		
		// Locate the dropdown element
      WebElement element = driver.findElement(By.xpath("(//div[@class='figure'])[1]")); // Use the appropriate locator
      //Thread.sleep(10000);
      driver.executeScript("arguments[0].scrollIntoView()", element); 
      
      //Thread.sleep(10000);
      
      Actions act=new Actions(driver);
      
      act.moveToElement(element).perform();
      
     // act.contextClick(element).perform();
      
      //driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]")).click();
  }
}
