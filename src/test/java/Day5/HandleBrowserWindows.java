package Day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	
	//capture the window ids
		
	Set<String> windowids = driver.getWindowHandles();//set
		
		//Approach1
	
//		List<String> windowList= new ArrayList(windowids); //set into the List collection
//		String parent= windowList.get(0);
//	    String child=	windowList.get(1);
//	    
//	    System.out.println(parent);
//	    System.out.println(child);
//	    
//	    //switching to child window
//	    
//	    driver.switchTo().window(child);
//	    driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
//	    
//      //switching to parent window
//	    
//	    driver.switchTo().window(parent);
//	    driver.findElement(By.name("username")).sendKeys("Admin");
	    
	
	//Approach2
	
	for(String winid:windowids)
	{
		String text=driver.switchTo().window(winid).getTitle();
		
	if(text.equals("OrangeHRM"))
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
	}
	
	else if(text.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
	{
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
	}	
	}
	
	driver.close();
}
}