package Dynamic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseleftClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/big-bachat-dhamaal-sale-store");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
       WebElement Cart =driver.findElement(By.xpath("//span[text()='Cart']"));
       Actions act=new Actions(driver);
       
     //  act.moveToElement(Cart).perform();
      // act.click().perform();
      // act.moveToElement(Cart).click().perform();
       
       act.click(Cart).perform();
	}

}
