package Scrollup;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broklinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","Drivert/chromedriver-win64/chromedriver.exe");
		
		 
	     String homepage="https://www.facebook.com/";
	     
	     String url= "";
	     HttpURLConnection huc=null;
	     int respCode=200;
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get(homepage);
	     List<WebElement>allLinks=driver.findElements(By.tagName("a"));
	     
	     
	     for(WebElement s1:allLinks)
	     {
	    	 
	    	 url=s1.getAttribute("href");
	    	 
	    	 if(url==null || url.isEmpty())

	    	 {
	    		 
	    		 System.out.println("URL belongs to another domain,skipping it is empty.");
	    		 continue;
	    		 
	    	 }
	    	 if(url.startsWith(homepage))

	    	 {
	    		 
	    		 System.out.println("URL belongs to another domain,skipping it.");
	    		 continue;
	    		 
	    	 }
	    	 try
	    	 {
	    		 
	    		 huc=(HttpURLConnection) (new URL(url).openConnection());
	    		 huc.setRequestMethod("HEAD");
	    		 huc.connect();
	    		 respCode=huc.getResponseCode();
	    		 
	    		 if(respCode>=400) 
	    		 {
	    			 System.out.println(url+":is a broken links");
	    			 
	    		 }
	    		 else {
	    			 
	    			 System.out.println(url+":is a valid links");

	    		 }
	    		 
	    	 }
	    	 catch(MalformedURLException e) 
	    	 {
	    		 e.printStackTrace();
	    	 }
	    	 catch(IOException e) 
	    	 {
	    		 e.printStackTrace();
	    	 }
	     }
	     driver.quit();
	     
	    }

}
