package FreamWork;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToPBApp 
{

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");

			 ChromeOptions op=new ChromeOptions();
		     op.addArguments("--disable-notifications");
		     
		     op.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		     
			 WebDriver driver = new ChromeDriver(op);
			  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20).toMillis(), TimeUnit.MILLISECONDS);

			  driver.get("https://myaccount.policybazaar.com/profile");
			  driver.manage().window().maximize();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//input[@id=\"mobileNo\"]")).sendKeys("8975776799");
			  
			  driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Ankita@123456");
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
			  Thread.sleep(2000);
			 
			  
			  driver.findElement(By.xpath("//p[text()='Profile']")).click();
			  
			  Thread.sleep(1000);
			  
			  

			  String Actfullname=driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).getAttribute("value");
			  String expfullname="Ankita Patil";
			  
			  String Actfullname1=driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).getAttribute("value");
			  String expfullname1=("ankita378patil@gmail.com");
			  
			  if(Actfullname.equals(expfullname)||Actfullname1.equals(expfullname1)) 
			  {
				  System.out.println("tc pass");
			  }
			  else
			  {
				  System.out.println("tc fail");
			  }
			  
						  
			  
			   /*
			  //driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("Pune,Maharashtra");		       		/* 
			 //click to sign in button 
			 driver.findElement(By.xpath("//a[@class=\"sign-in\"]")).click();
			 Thread.sleep(2000);
			//click on mon numberbutton
			 
			 driver.findElement(By.xpath("(//input[@id=\"central-login-module-sign-mobile\"])[2]")).sendKeys("8975776799");
			 //click on signin with pwd button
			 Thread.sleep(3000);

              driver.findElement(By.xpath("(//span[@id=\"central-login-sign-in-with-password-span\"])[2]")).click();
 			 Thread.sleep(2000);
             WebDriverWait wait = new WebDriverWait(driver, 10);
             WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@id=\"central-login-sign-in-with-password-span\"])[2]")));
             element.click();
    */     
	 }

}
