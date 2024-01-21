package Dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightclic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/big-bachat-dhamaal-sale-store");
		 driver.manage().window().maximize();
       WebElement Cart =driver.findElement(By.xpath("//span[text()='Cart']"));
       Actions act=new Actions(driver);
       //act.contextClick().perform();
       //act.moveToElement(Cart).contextClick().perform();
       act.click(Cart).perform();
       

	}

}
