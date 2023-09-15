package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_page {

	
//	Open Web Browser(Chrome/IE/firefox).
//	2) Open URL  https://auth.geeksforgeeks.org/  
//	3) Enter username  (ruchika@bebotechnologies.com).
//	4) Enter password  (test123).   
//	5) Click on Login.
//	6) Capture title of the home page.
//	7) Verify title of the page: OrangeHRM 
//	8) Close browser
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // 4.4
		//Open Web Browser
		ChromeDriver driver =new ChromeDriver();
		
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
