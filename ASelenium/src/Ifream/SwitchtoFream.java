package Ifream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoFream {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	
		   driver.manage().window().maximize();
	        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	        Thread.sleep(1000);
	       //ifream swithch to fream
	        driver.switchTo().frame("iframeResult");//String  fream name 
	        //driver.switchTo().frame("iframeResult");//string fream name 
	        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
	        //driver.switchTo().frame(0);//index
	        
	        driver.findElement(By.xpath("//button[contains (text(),'Click me to display Date and Time.')]")).click();
	        
		
	
	}

}
