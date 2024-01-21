package Gtrsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	        driver1.get("https://www.hrm.hulatech.com/symfony/web/index.php/auth/login");
	       String text= driver1.findElement(By.xpath("//a[text()='Forgot your password?']")).getText();
	       System.out.println(text);
	      boolean result= driver1.findElement(By.xpath("//input[@value=\"LOGIN\"]")).isEnabled();
	      System.out.println(result);
	      boolean result1= driver1.findElement(By.xpath("//input[@value=\"LOGIN\"]")).isSelected();
	      System.out.println(result1);
	      boolean result2= driver1.findElement(By.xpath("//input[@value=\"LOGIN\"]")).isDisplayed();
	      System.out.println(result2);
	      Thread.sleep(2000);
	    
	     
	       // driver1.findElement(By.xpath(""))
	}

}
