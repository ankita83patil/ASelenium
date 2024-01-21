package Gtrsd;



import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listselect {

	public static void main(String[] args) throws InterruptedException 
	{

		
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
		 Thread.sleep(2000);
		  driver1.get("file:///C:/Users/ankita.patil/Desktop/java%20documents/Samole_3.html");
	        Thread.sleep(2000);
	        WebElement monts1= driver1.findElement(By.xpath("//select[@id='1234']"));
		       
		      Select mo=new Select(monts1);
		      mo.selectByIndex(0);
		      mo.selectByIndex(1);
		      List<WebElement>allSelectOptions =mo.getAllSelectedOptions();
		      for(WebElement s1:allSelectOptions) 
		      {
		    	  
		    	  System.out.println(s1.getText());
		      }
	       // driver1.findElement(By.xpath("")).click();
	        ////select[@id='1234']
	}	       

}
