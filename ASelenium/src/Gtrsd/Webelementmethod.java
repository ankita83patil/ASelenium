package Gtrsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementmethod {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	        driver1.get("https://www.hrm.hulatech.com/symfony/web/index.php/auth/login");
	        
	        Thread.sleep(2000);
	        //driver1.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("lkioo");
	        //Thread.sleep(3000);
	        //driver1.findElement(By.xpath("//input[@name='txtUsername']")).clear();
	        //Thread.sleep(2000);
	       // driver1.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("lkioo");

	      WebElement un= driver1.findElement(By.xpath("//input[@name='txtUsername']"));
	       un.sendKeys("ddd");
	       Thread.sleep(2000);
	       un.clear();
	       Thread.sleep(2000);
	       un.sendKeys("ddddfff");
	       
	       
	}

}
