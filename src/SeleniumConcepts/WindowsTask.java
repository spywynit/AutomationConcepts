package SeleniumConcepts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsTask {
  @Test
  public void f() throws Exception {
	  
	  ChromeDriver driver=new ChromeDriver();   //  chrome browseer
		
	  	driver.manage().window().maximize();  // maximizing
		
		//Thread.sleep(5000); //
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
				
		driver.get("https://practice.expandtesting.com/windows");
		//Thread.sleep(5000);
		
		// Locate the dropdown element
    WebElement element = driver.findElement(By.xpath("//a[text()='Click Here']")); // Use the appropriate locator
    
    driver.executeScript("arguments[0].scrollIntoView()", element); 
    
    element.click();
    
 // Get the current window handle (main tab)
    String mainWindow = driver.getWindowHandle();

    // Get all window handles
    Set<String> windowHandles = driver.getWindowHandles();

    // Switch to the new tab (not the main tab)
    for (String handle : windowHandles) {
       Thread.sleep(5000);
       System.out.println(driver.getTitle());
            driver.switchTo().window(handle); // Switch to the new tab
            
    }
    Thread.sleep(10);
    driver.switchTo().window(mainWindow);
    //System.out.println(driver.getTitle());
    
    
  }
}
