package WebTable;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rowtable {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("file:///C:/Users/ankita.patil/Desktop/java%20documents/Sample_4.html");
	     //Step1
	     List<WebElement>allRows=driver.findElements(By.xpath("//table[@id='1234']//tr"));//List use ->Elements 
	     System.out.println(allRows.size());

	}

}
