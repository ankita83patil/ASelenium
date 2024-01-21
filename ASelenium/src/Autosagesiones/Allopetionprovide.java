package Autosagesiones;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allopetionprovide {

	public static void main(String[] args) throws InterruptedException
	
	{
	// all option present select the perticular positon
		//handling multiple solution 
		
	     System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		  driver.get("https://www.google.co.in/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]")).sendKeys("redmi");
		  Thread.sleep(2000);
		  String Expectedtext="redmi note 13 pro";
		  List<WebElement>allopetions=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		  for(WebElement a:allopetions)
		  {
			  
			 String atext=a.getText();
			 if(atext.equals(Expectedtext)) 
			 {
			    a.click();
			    break;
			 }
			 
		   }
	
	}

}
