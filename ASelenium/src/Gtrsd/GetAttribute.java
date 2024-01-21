package Gtrsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	        driver1.get("https://www.hrm.hulatech.com/symfony/web/index.php/auth/login");
	        Thread.sleep(2000);
            driver1.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("abhjh");
	    
	        String value= driver1.findElement(By.xpath("//input[@name=\"txtUsername\"]")).getAttribute("value");
	         System.out.println(value);

	}

}
