package Scrollup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupex {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     //scroll down ->1st parameter 0 second parameter+ve
	     ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	     //scroll up
	     ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
	     
	     //scroll right  -1st parameter +VE second parameter 0
	    // ((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
	     
	     //scroll left 1st parameter -negative second parameter 100
	     //((JavascriptExecutor)driver).executeScript("window.scrollBy(-50,100)");

	     
	}

}
