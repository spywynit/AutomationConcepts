package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverClass {
	
	
	public static void main(String[] args) throws Exception {
		
		//String chromeFilePath="C:\\Users\\USER\\Desktop\\SeleniumJars\\chromedriver_win32 (2)\\chromedriver.exe";
		//String chromeFilePath="C:\\Users\\USER\\Desktop\\AuomationSelenium\\ChromeFolder\\chromedriver-win64\\chromedriver.exe";
		
		//System.setProperty("webdriver.chrome.driver", chromeFilePath);
		
		ChromeDriver chromebrowser=new ChromeDriver();   //  chrome browseer
		
		chromebrowser.get("https://demoqa.com/text-box");
		
		chromebrowser.manage().window().maximize();
		
		chromebrowser.findElement(By.id("userName")).sendKeys("Spywyn");
		
		Thread.sleep(5000);
		
		WebElement ele=chromebrowser.findElement(By.id("submit"));
		
		chromebrowser.executeScript("arguments[0].scrollIntoView();", ele);
		
		Thread.sleep(5000);
		ele.click();
		
		Thread.sleep(5000);
		
		String name=chromebrowser.findElement(By.id("name")).getText();
		
		System.out.println(name);
		
		
		
		//WebDriver driver=new ChromeDriver();
		
		
		

	}

}
