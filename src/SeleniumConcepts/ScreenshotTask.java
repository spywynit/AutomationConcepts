package SeleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotTask {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver=new ChromeDriver();   //  chrome browseer
		
	  	driver.manage().window().maximize();  // maximizing
		
		//Thread.sleep(5000); //
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
				
		driver.get("https://practice.expandtesting.com/windows");
		
	  // Take a screenshot
      TakesScreenshot screenshotDriver = (TakesScreenshot) driver;

      // Get the screenshot as a file
      File screenshot = screenshotDriver.getScreenshotAs(OutputType.FILE);
      
      // You can specify any valid path here
     //String directoryPath = "C:/Users/YourUsername/Pictures/Screenshots/";  // Make sure to update this path
      //C:\Users\USER\Desktop\EclipseWorkspaceVenky\AutomationClassProject\screenshot.png
     
      String projectPath=System.getProperty("user.dir");
      
      String folderPath="\\Screenshots\\";
      
      String fileName = "screenshot.png";
      
      String completefilePath=projectPath+folderPath+fileName;
      
      //System.out.println(System.getProperty("user.dir"));

      // Create a File object with the specific path
      File destinationFile = new File(completefilePath);

      // Specify the location where the screenshot will be saved
      //File destinationFile = new File("screenshot.png");

     
          FileUtils.copyFile(screenshot, destinationFile);
        
  }
}
