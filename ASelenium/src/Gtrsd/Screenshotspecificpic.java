package Gtrsd;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotspecificpic {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	        driver1.get("https://www.hrm.hulatech.com/symfony/web/index.php/auth/login");
	        Thread.sleep(2000);
	      WebElement  ele=driver1.findElement(By.xpath("//img[@src=\"/symfony/web/webres_5d69118beeec64.10301452/themes/default/images/login/logo.png\"]"));
	       File src=ele.getScreenshotAs(OutputType.FILE);
	       
	       File sc=new File("C:\\Screenshot\\alkss.jpg");
	       
	        FileHandler.copy(src, sc);
	        
	}

}
