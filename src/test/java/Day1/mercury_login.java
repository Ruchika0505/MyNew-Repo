package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mercury_login {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // 4.4
		//Open Web Browser
		ChromeDriver driver =new ChromeDriver();
		
		//Open URL
		driver.get("https://demo.guru99.com/test/newtours/");
		
		// Enter username
		driver.findElement(By.name("userName")).sendKeys("mercury");
	
		// Enter password
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		//Click on Login.
		driver.findElement(By.name("submit")).click();
		
		//Capture title of the home page.
		
	String act_title = driver.getTitle();
//	String exp_title= "Login GeeksforGeeks";
	
	System.out.println(act_title);
	
	//Verify title of the page
	
//	if(act_title.equals(exp_title))
//		System.out.println("Test Passed");
//	else
//		System.out.println("Test Failed");
	
	//Close browser
	driver.close();
	
		
	}
	
}

