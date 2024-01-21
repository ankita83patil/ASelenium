package Gtrsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectGetattri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
		 Thread.sleep(2000);
	        driver1.get("https://demo.automationtesting.in/Datepicker.html");
	        //driver1.findElement(By.xpath("(//a[@data-toggle=\"dropdown\"])[2]")).click();
	        Thread.sleep(2000);
	        driver1.findElement(By.xpath("//input[@id='datepicker1']")).click();
	        Thread.sleep(2000);
	       WebElement monts1= driver1.findElement(By.xpath("//span[@title='Monday']"));
	       
	       Select mo=new Select(monts1);
	       mo.selectByVisibleText("Tu");
	       mo.selectByValue("Tu");
	       mo.selectByIndex(1);
	}

}
