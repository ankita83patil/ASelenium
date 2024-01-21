package Dynamic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException 
	//Action class and move the element Action class 
	{

	    System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/big-bachat-dhamaal-sale-store");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15).toMillis(), TimeUnit.MILLISECONDS);
		 driver.manage().window().maximize();
       WebElement login =driver.findElement(By.xpath("//a[text()='Login']"));
       Actions act=new Actions(driver);
       act.moveToElement(login).perform();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
	}

}
