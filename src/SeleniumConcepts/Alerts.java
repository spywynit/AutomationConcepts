package SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
  @Test
  public void f() throws Exception {
	  
	  ChromeDriver driver=new ChromeDriver();   //  chrome browseer
		
	  	driver.manage().window().maximize();  // maximizing
	  	
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 500ms  -  1000 ms is 1 sec
		
	  	//https://www.selenium.dev/selenium/web/alerts.html
		
			driver.get("https://www.selenium.dev/selenium/web/alerts.html");
			
			driver.findElement(By.xpath("(//a[@id='alert'])[1]")).click();
			
			Thread.sleep(5000);
			
			driver.switchTo().alert().accept();
			
			//dis
			
			
			
			
			
			
			//Alert alt=new Alert() {
				
			
  }
}
