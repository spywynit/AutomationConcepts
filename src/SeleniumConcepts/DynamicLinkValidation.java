package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLinkValidation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeDriver chromebrowser=new ChromeDriver();   //  chrome browseer
		
		
		
		chromebrowser.manage().window().maximize();  // maximizing
		
		Thread.sleep(5000); //
		
				
		chromebrowser.get("https://spywyn.com/");  // spywyn url
		
		Thread.sleep(5000);
		
		// to get  multiple webelemnts 
		
		List<WebElement>  l=chromebrowser.findElements(By.xpath("(//a[@class='menu-link'])"));  //  35 elements
		
		System.out.println(l.size());     //4000
		
		for(int i=0;i<l.size();i++) {
			
			System.out.println(i);
			
			System.out.println(l.get(i).getText());
		}
	
		/*
		 * System.out.println(l.get(0).getText()); // 0
		 * System.out.println(l.get(1).getText()); // 1
		 * System.out.println(l.get(2).getText()); // 2
		 * System.out.println(l.get(3).getText()); //3
		 * System.out.println(l.get(4).getText());
		 * System.out.println(l.get(5).getText());
		 * System.out.println(l.get(6).getText());
		 * System.out.println(l.get(7).getText());
		 * System.out.println(l.get(8).getText());
		 * System.out.println(l.get(9).getText());
		 * System.out.println(l.get(10).getText());
		 * System.out.println(l.get(11).getText());
		 * System.out.println(l.get(12).getText());
		 * System.out.println(l.get(13).getText());
		 * System.out.println(l.get(35).getText()); //35
		 */		
		
		
		/*
		 * System.out.println(chromebrowser.findElement(By.xpath(
		 * "(//a[@class='menu-link'])[1]")).getText());
		 * 
		 * System.out.println(chromebrowser.findElement(By.xpath(
		 * "(//a[@class='menu-link'])[2]")).getText());
		 * 
		 * System.out.println(chromebrowser.findElement(By.xpath(
		 * "(//a[@class='menu-link'])[3]")).getText());
		 * 
		 * System.out.println(chromebrowser.findElement(By.xpath(
		 * "(//a[@class='menu-link'])[4]")).getText());
		 * 
		 * System.out.println(chromebrowser.findElement(By.xpath(
		 * "(//a[@class='menu-link'])[10]")).getText());
		 * 
		 * System.out.println(chromebrowser.findElement(By.xpath(
		 * "(//a[@class='menu-link'])[11]")).getText());
		 */

	}

}
