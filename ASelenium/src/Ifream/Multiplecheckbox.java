package Ifream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplecheckbox {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		//this code use to handle all the checkbox click 
		
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         
         driver.get("file:///C:/Users/ankita.patil/Desktop/java%20documents/check.html");
         Thread.sleep(1000);

         List<WebElement>allLinks=driver.findElements(By.xpath("//input[@ type='checkbox']"));
         for(WebElement a:allLinks)
         {
        	 a.click();
        	 Thread.sleep(1000);
        	 
        	 
        	 
         }
         
	}

}
