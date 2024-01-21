package Selectopetion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectSpecificopetion {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	     driver1.get("https://www.facebook.com/campaign/landing.php");
	     //Step1
	   WebElement month= driver1.findElement(By.xpath("//select[@id=\"month\"]"));
	   
	     Actions act= new Actions(driver1);
	     
         act.click(month).perform();
         act.sendKeys(Keys.HOME).perform();
         
         for(int i=0;i<10;i++) 
         {
        	 act.sendKeys(Keys.ARROW_DOWN).perform();
        	 
         }
         Thread.sleep(1000);
         act.sendKeys(Keys.ENTER);
	}

}
