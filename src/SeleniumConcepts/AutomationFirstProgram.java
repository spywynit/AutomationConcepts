package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import JavaConcepts.FirstProgram;

public class AutomationFirstProgram {
	
		static void validatingFullnameTextbox() throws Exception {
		
		ChromeDriver chromebrowser=new ChromeDriver();  
				
		chromebrowser.manage().window().maximize();
		
		chromebrowser.get("https://demoqa.com/text-box");  // get
		
		WebElement fullname=chromebrowser.findElement(By.id("userName"));  // findelement  -- id 
		
		Thread.sleep(1000);  // 
		
		chromebrowser.executeScript("arguments[0].scrollIntoView()", fullname);  // scroll to element -- fullname
		
		Thread.sleep(1000);
		
		fullname.sendKeys("SPYWYN");  // sendkeys
		
		WebElement submit=chromebrowser.findElement(By.id("submit"));  // 
		
		Thread.sleep(1000);
		
		chromebrowser.executeScript("arguments[0].scrollIntoView()", submit);  //
		
		Thread.sleep(1000);
		
		submit.click();
		
		WebElement result=chromebrowser.findElement(By.id("name"));  //
		
		String actualResult=result.getText();  // gettext()  -- string   --// Name:SPYWYN
		
		System.out.println(actualResult);
		
		String expectedResult="Name:SPYWYN";
		
		
		
		if(expectedResult.equals(actualResult)) {  // equals 
			
			System.out.println("Testcase pass");
			
		}else {
			
			System.out.println("Testcase failed");
		}
		
		chromebrowser.close();
	}

	public static void main(String[] args) throws Exception {
		
		for(int i=1;i<=2;i++) {
		// TODO Auto-generated method stub
			
			System.out.println("1st for loop");
			
			validatingFullnameTextbox();
		
		}
		
		for(int i=1;i<=3;i++) {
			// TODO Auto-generated method stub
			
			System.out.println("2nd  for loop");
			validatingFullnameTextbox();
			}
		
	}

}
