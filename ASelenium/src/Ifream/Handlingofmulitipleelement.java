package Ifream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingofmulitipleelement {

	public static void main(String[] args) {
		
		// this code use to automation get to the all links 
		
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	
		   driver.manage().window().maximize();
	        driver.get("https://www.simplilearn.com/resources/software-development/ebooks");
	        List<WebElement>allLinks=driver.findElements(By.xpath("//a"));
	        for(WebElement links:allLinks) 
	        	
	        {
	        	System.out.println(links.getText());
	        	
	        }
	}

}
