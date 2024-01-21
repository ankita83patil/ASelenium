package Dynamic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestdanamicElement 
{

	public static void main(String[]args) throws InterruptedException 
	
	{
		    System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.flipkart.com/big-bachat-dhamaal-sale-store");
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15).toMillis(), TimeUnit.MILLISECONDS);


		    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 12");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		  //(//div[@class="_2kHMtA"])[1]
		    Thread.sleep(1000);
		   String text =driver.findElement(By.xpath("((//div[@class=\"_2kHMtA\"])[1]//span)[6]")).getText();
		   System.out.println(text);
	}
}
