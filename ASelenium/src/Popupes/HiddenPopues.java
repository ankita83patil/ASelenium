package Popupes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopues {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	
		   driver1.manage().window().maximize();
	        driver1.get("https://www.flipkart.com/");
	        driver1.findElement(By.xpath("//a[@href='/account/login?ret=/']")).click();
	        Thread.sleep(1000);
	        driver1.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("12525252525");
	        
	        
	}

}
