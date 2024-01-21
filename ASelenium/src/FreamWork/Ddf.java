package FreamWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ddf {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		
	        // Set the path to the ChromeDriver executable
			System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
            driver.get("https://myaccount.policybazaar.com/profile");
      	  Thread.sleep(1000);
      	  FileInputStream file=new  FileInputStream("C:\\FileWriting\\DDF.xlsx");
      	 Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
      	 String mobnumber=sh.getRow(0).getCell(0).getStringCellValue();
		  driver.findElement(By.xpath("//input[@id=\"mobileNo\"]")).sendKeys(mobnumber);

	        
	            
	    }
	}


