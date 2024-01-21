package Gtrsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselected {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
		 Thread.sleep(2000);
		  driver1.get("https://demo.automationtesting.in/Datepicker.html");
	        //driver1.findElement(By.xpath("(//a[@data-toggle=\"dropdown\"])[2]")).click();
	        Thread.sleep(2000);
	        driver1.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]")).click();
	        Thread.sleep(2000);
	       WebElement monts1= driver1.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]"));
	       
	      Select mo=new Select(monts1);
	        Thread.sleep(2000);

	    //mo.deselectByValue("Slider");
	    //mo.deselectByIndex(0);
	    //mo.deselectByVisibleText("Slider");
	    //mo.selectByValue("Slider");
	        mo.selectByVisibleText("Slider");
	       String text= mo.getFirstSelectedOption().getText();
	       System.out.println(text);
	    
	}

}
