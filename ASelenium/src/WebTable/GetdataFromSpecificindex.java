package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetdataFromSpecificindex {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("file:///C:/Users/ankita.patil/Desktop/java%20documents/Sample_4.html");
	     //Step1
	    String value=driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]")).getText();
	    System.out.println(value);
	    
	    String value1=driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[3]")).getText();
	    System.out.println(value1);
	}
	}


