package Ifream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtomainfream 
{

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	
		   driver.manage().window().maximize();
	        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	        
	        driver.switchTo().frame("iframeResult");//String  fream name 
	        
	        driver.findElement(By.xpath("//button[contains (text(),'Click me to display Date and Time.')]")).click();
	        
	        Thread.sleep(3000);
	        //switch to main page
	        
	       // driver.switchTo().defaultContent();
	        driver.switchTo().parentFrame();
	        driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	        
	        
	        
	        


	}

}
