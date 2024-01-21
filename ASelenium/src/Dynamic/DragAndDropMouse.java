package Dynamic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20).toMillis(), TimeUnit.MILLISECONDS);
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		 WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		 
		 WebElement drc=driver.findElement(By.xpath("(//div[@class=\"ui-widget-content\"])[3]"));
		 
		 Actions act=new Actions(driver);
		 
		 act.dragAndDrop(src, drc).perform();

	}

}
