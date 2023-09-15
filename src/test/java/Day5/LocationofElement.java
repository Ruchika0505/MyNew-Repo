package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationofElement {

	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	driver.manage().window().maximize();

		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		System.out.println("The location of logo is " +logo.getLocation()); //(276, 79)
		
		driver.manage().window().maximize();
		System.out.println("The location of logo After maximize is: " +logo.getLocation()); // (476, 62) 

		driver.manage().window().minimize();
		System.out.println("The location of logo After minimize is: " +logo.getLocation()); 
		
		 driver.manage().window().fullscreen();
		 System.out.println("The location of logo After fullscreen is: " +logo.getLocation()); 
		 
		 Point p= new Point(100,100);
		 driver.manage().window().setPosition(p);
		 System.out.println("The location of logo After setting window size is: " +logo.getLocation());
		 
		 p=new Point(50,60);
		 driver.manage().window().setPosition(p);
		 System.out.println("The location of logo After setting new window size is: " +logo.getLocation());
		 
			
	}
}
