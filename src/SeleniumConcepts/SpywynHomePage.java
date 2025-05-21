package SeleniumConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpywynHomePage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//chromebrowser.executeScript("arguments[0].scrollIntoView();", ele);
		
		ChromeDriver chromebrowser=new ChromeDriver();   //  chrome browseer
		
		
		
		chromebrowser.manage().window().maximize();
		
		Thread.sleep(5000);
		
				
		chromebrowser.get("https://spywyn.com/");
		
		Thread.sleep(5000);
		
		String s="spywyn";
		
		//array
		
		String[] names= {"spywyn","spywyn1","spywyn2"};
		
		int[] xyz= {1,2,3};
		
		// list
		
		List<String> l=new ArrayList<String>();
		l.add("spywyn");
		
		//set
		
		Set<String>  hs=new HashSet<String>();
		
		
		List<WebElement> a=chromebrowser.findElements(By.xpath(""));
		
		
		
		
		
		
		WebElement courses_ele=chromebrowser.findElement(By.xpath("(//a[@class='menu-link'])[2]"));
		
		System.out.println(courses_ele.isDisplayed());
		
		System.out.println(courses_ele.getText());
		
		String expectedResult="Courses";  // client expectation
		
		// actual from application
		String actualResult = courses_ele.getText();
		
		if(actualResult.contains(expectedResult)) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}
		
		
		
		
		
		//chromebrowser.findElement(By.xpath("(//a[@class='menu-link'])[2]")).isDisplayed();
		
		Thread.sleep(5000);
		
		//System.out.println(chromebrowser.getCurrentUrl());
		
		//String cureenturl=chromebrowser.getCurrentUrl();
		
		

	}

}
