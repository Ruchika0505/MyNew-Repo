package Day7;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//Total no of links 
		
		List <WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("The total no of links are: " +links.size()); //48
		
		int brokenlinks=0; 
		
		for(WebElement linkEle:links)
		{
		String hrefAttValue =linkEle.getAttribute("href");
		
		// first condition for checking the broken links
		
		if(hrefAttValue==null || hrefAttValue.isEmpty())
		{
			System.out.println("href attribute is empty");
			continue;
		}
		
		//Checking link is broken or not(status code)
		
		URL linkurl =new URL(hrefAttValue); //converting String into URL format
		
		//send the request to server ---- open ,connect
		
		HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
		conn.connect();
		
		if(conn.getResponseCode()>=400)
		{
			System.out.println(hrefAttValue + "   "+ "======> Broken Link");
			brokenlinks++;
		}
		
		else
		{
			System.out.println(hrefAttValue + "   "+ "======> NOT Broken Link");
		}
		
}
	System.out.println("Total no of broken links " +brokenlinks);	
		
	}
}
