package Scrollup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollintoview {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
	     driver.get("https://www.facebook.com/");
	     
	     driver.manage().window().maximize();
	     
	     WebElement trems=driver.findElement(By.xpath("//a[text()='Terms']"));
	     
	     ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",trems);

	}

}
