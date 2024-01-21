package Notification;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationhandle {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");

		 ChromeOptions op=new ChromeOptions();
	     op.addArguments("--disable-notifications");
	     
		 WebDriver driver1 = new ChromeDriver(op);
		 driver1.manage().timeouts().implicitlyWait(Duration.ofMillis(10).toMillis(), TimeUnit.MILLISECONDS);

	     driver1.get("https://www.redbus.in/");
	}

}
