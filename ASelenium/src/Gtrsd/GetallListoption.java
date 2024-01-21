package Gtrsd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetallListoption {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
		 Thread.sleep(2000);
		  driver1.get("file:///C:/Users/ankita.patil/Desktop/java%20documents/Samole_3.html");
	        Thread.sleep(2000);
	        WebElement monts1= driver1.findElement(By.xpath("//select[@id='1234']"));
		      Select s1=new Select(monts1);
		     List<WebElement>allOptions= s1.getOptions();
		     for(WebElement s:allOptions) 
		     {
		    	System.out.println(s.getText()); 
		     }

		       
	}

}
