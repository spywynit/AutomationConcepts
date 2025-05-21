package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
  @Test
  public void f() throws Exception {
	  	ChromeDriver driver=new ChromeDriver();   //  chrome browseer
		
	  	driver.manage().window().maximize();  // maximizing
		
		Thread.sleep(5000); //
		
				
		driver.get("https://practice.expandtesting.com/dropdown");
		Thread.sleep(5000);
		
		// Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='country']")); // Use the appropriate locator
        
        driver.executeScript("arguments[0].scrollIntoView()", dropdownElement); 

        // Create a Select object
        Select dd = new Select(dropdownElement);
        
        
        
        dd.selectByIndex(1);
        
        //dd.selectByValue("AU");
        
     // Select by visible text
        //dd.selectByVisibleText("Australia");
  }
}
