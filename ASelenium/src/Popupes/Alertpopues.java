package Popupes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//https://demo.guru99.com/test/delete_customer.php

		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	
		   driver1.manage().window().maximize();
	        driver1.get("https://demo.guru99.com/test/delete_customer.php");
	        Thread.sleep(1000);
	        driver1.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1252");
	       
	        driver1.findElement(By.xpath("//input[@type='submit']")).click();
	        
	        //get text
	        
	        String text= driver1.switchTo().alert().getText();
	        System.out.println(text);
	       
	        
	        //click cancel buttomn
	       
	        //driver1.switchTo().alert().dismiss();
	       
	       //click on ok btn popup
	        driver1.switchTo().alert().accept();
	        
	        //next popupes 2nd time open then ok button click
	        
	        Thread.sleep(1000);
	        driver1.switchTo().alert().accept();
	        
	       
	     
	}

}
