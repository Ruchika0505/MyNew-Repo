package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_cmds {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	
		 Thread.sleep(3000);
 driver.navigate().to("https://www.amazon.in/"); //string 
 
 System.out.println(driver.getCurrentUrl());
 
 Thread.sleep(3000);
 driver.navigate().to("https://www.flipkart.com/"); 
 
 System.out.println(driver.getCurrentUrl());
 
 Thread.sleep(3000);
 driver.navigate().back();
 System.out.println(driver.getCurrentUrl());
 
 Thread.sleep(3000);
 
 driver.navigate().forward();
 System.out.println(driver.getCurrentUrl());
 
 Thread.sleep(3000);
 driver.navigate().refresh();
 
 Thread.sleep(3000);
 
 driver.close();
 

}
}