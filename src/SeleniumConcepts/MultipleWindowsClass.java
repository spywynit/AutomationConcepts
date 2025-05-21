package SeleniumConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipleWindowsClass {
  @Test
  public void f() throws Exception {
	  
	  ChromeDriver driver=new ChromeDriver();
	  
	  String url="https://practice.expandtesting.com/windows";
	  
	  driver.get(url);
	  
	  driver.manage().window().maximize();
	  
	 // Windows page for Automation Testing Practice  -- window1
	  
	 // Example of a new window   -- window2
	  
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	  
	  System.out.println(driver.getTitle());
	  
	  String mainwindow=driver.getWindowHandle();
	  
	 Set<String> allwindows=driver.getWindowHandles();
	 
	 
	 for(String childwindow:allwindows) {
		 
		 Thread.sleep(5000);
		
			
			driver.switchTo().window(childwindow);
	
		 
	 }
	 
	 driver.switchTo().window(mainwindow);
	  
	  
	  
	  
  }
}
