package Popupes;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childswithchtoparent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
	
		 driver1.manage().timeouts().implicitlyWait(Duration.ofMillis(10).toMillis(), TimeUnit.MILLISECONDS);
		//driver1.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
           driver1.manage().window().maximize();

	        driver1.get("https://skpatro.github.io/demo/links/");
	        
	        Thread.sleep(2000);
	        driver1.findElement(By.xpath("//input[@name='NewTab']")).click();
	        //get child window click the tranding 
	        Set<String>allIds =driver1.getWindowHandles();
	        ArrayList<String>a1=new ArrayList<>(allIds);
	        driver1.switchTo().window(a1.get(1));
	        
	        Thread.sleep(1000);
	        //click on child window 
	        driver1.findElement(By.xpath("(//a[@data-level='1'])[12]")).click();
	        //switch to main page 
	        driver1.switchTo().window(a1.get(0));

	        Thread.sleep(3000);
	        //click on main window 
	        driver1.findElement(By.xpath("//input[@name='NewWindow']")).click();
	        
	        Thread.sleep(3000);

	        Set<String>allIdss =driver1.getWindowHandles();
	        ArrayList<String>a=new ArrayList<>(allIdss);
	        driver1.switchTo().window(a1.get(1));
	        driver1.findElement(By.xpath("(//a[@href='https://qavalidation.com/'])[7]")).click();
	        
	        
	        
	     }

}
