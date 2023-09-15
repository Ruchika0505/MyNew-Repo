package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessTesting {

	
//	1) Open Web Browser(Chrome/IE/firefox).
//	2) Open URL  https://auth.geeksforgeeks.org/  
//	3) Enter username  (ruchika@bebotechnologies.com).
//	4) Enter password  (test123).   
//	5) Click on Login.
//	6) Capture title of the home page.
//	7) Verify title of the page: OrangeHRM 
//	8) Close browser
	
	public static void main(String[] args) {
		
		//Appraoch1) Headless Mode
		
//	ChromeOptions options=new ChromeOptions();
//		//options.setHeadless(true);
//		options.addArguments("--headless=new");
//		
		
		
		//Appraoch2) Headless Mode
		
		ChromeOptions options=new ChromeOptions();
//		//options.setHeadless(true);
		options.addArguments("--headless=new");
		
		//WebDriver
		
		WebDriver driver=WebDriverManager.chromedriver().capabilities(options).create();
		
		//WebDriverManager.chromedriver().setup(); // 4.4
		//Open Web Browser
	//	WebDriver driver =new ChromeDriver(options);
		
		//Open URL
		driver.get("https://auth.geeksforgeeks.org/");
		
		// Enter username
		driver.findElement(By.id("luser")).sendKeys("ruchika@bebotechnologies.com");
	
		// Enter password
		driver.findElement(By.name("pass")).sendKeys("test123");
		
		//Click on Login.
		driver.findElement(By.className("signin-button")).click();
		
		//Capture title of the home page.
		
	String act_title = driver.getTitle();
	String exp_title= "Login GeeksforGeeks";
	
	//System.out.println(title);
	
	//Verify title of the page
	
	if(act_title.equals(exp_title))
		System.out.println("Test Passed");
	else
		System.out.println("Test Failed");
	
	//Close browser
	driver.close();
	
		
	}
	
}
