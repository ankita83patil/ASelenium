package Popupes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchalertpop {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	
		   driver1.manage().window().maximize();
	        driver1.get("https://demo.guru99.com/test/delete_customer.php");
	        Thread.sleep(1000);
	        driver1.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1252");
	       
	        driver1.findElement(By.xpath("//input[@type='submit']")).click();
	        
	        
	        //switch alert
	        //Alert method object is store 
	       Alert alt= driver1.switchTo().alert();
	       
	       //get textwca/a uil2.0 webpage
	        
	        String text= driver1.switchTo().alert().getText();
	        System.out.println(text);
	        alt.accept();
		     alt.dismiss();
	        
	        
	       
	        
	}

}
