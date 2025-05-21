package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionsclass {
  @Test
  public void f() {
	  
	  ChromeDriver driver=new ChromeDriver();
	  
	  String url="https://www.flipkart.com/";
	  
	  driver.get(url);
	  
	  driver.manage().window().maximize();
	  
	  WebElement login_element=driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
	  
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(login_element);
  }
}
