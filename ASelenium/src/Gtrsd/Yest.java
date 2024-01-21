package Gtrsd;

import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.Constant;

public class Yest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	        driver1.get("https://www.hrm.hulatech.com/symfony/web/index.php/auth/login"); 
	        Thread.sleep(2000);
	        driver1.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("abddb");
	        Thread.sleep(2000);

	 }

	
}
