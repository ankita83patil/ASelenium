package Gtrsd;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshot {

	private static final int FILE = 0;

	public static void main(String[] args) throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	        driver1.get("https://www.hrm.hulatech.com/symfony/web/index.php/auth/login");
	        Thread.sleep(2000);
	        File screenshotFile=((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
	        System.out.println(screenshotFile);
	        File sc=new File("C:\\Screenshot\\abh.jpg");
	        FileHandler.copy(screenshotFile, sc);
	        
	}

}
