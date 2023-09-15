package Day5;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithNoElement
{
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//http://the-internet.herokuapp.com/basic_auth
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		String text =driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
	
	if(text.contains("Congratulations"))
	{
		System.out.println("Test Passed");
	}
	else
		System.out.println("Test Failed");
	}
}
