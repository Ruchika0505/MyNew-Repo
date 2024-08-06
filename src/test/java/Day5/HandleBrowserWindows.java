package Day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.name("username")).sendKeys("Shubhamse90@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("Mi=shu08@123");
		driver.findElement(By.name("Login")).click();
		
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	
		Thread.sleep(3000);
		
		WebElement search=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[1]/div[2]/one-app-launcher-menu[1]/div[1]/one-app-launcher-search-bar[1]/lightning-input[1]/lightning-primitive-input-simple[1]/div[1]/div[1]/input[1]"));
		search.sendKeys("Contact Tracing");
		driver.findElement(By.xpath("//b[normalize-space()='Contact Tracing']")).click();
		
		//capture the window id
		
		String id=driver.getWindowHandle();
		
		System.out.println(id);
	}
}
//capture the window ids
//		
//	Set<String> windowids = driver.getWindowHandles();//set
//		
//		//Approach1
//	
////		List<String> windowList= new ArrayList(windowids); //set into the List collection
////		String parent= windowList.get(0);
////	    String child=	windowList.get(1);
////	    
////	    System.out.println(parent);
////	    System.out.println(child);
////	    
////	    //switching to child window
////	    
////	    driver.switchTo().window(child);
////	    driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
////	    
////      //switching to parent window
////	    
////	    driver.switchTo().window(parent);
////	    driver.findElement(By.name("username")).sendKeys("Admin");
//	    
//	
//	//Approach2
//	
//	for(String winid:windowids)
//	{
//		String text=driver.switchTo().window(winid).getTitle();
//		
//	if(text.equals("OrangeHRM"))
//	{
//		driver.findElement(By.name("username")).sendKeys("Admin");
//	}
//	
//	else if(text.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
//	{
//		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
//	}	
//	}
//	
//	driver.close();
//}
//}