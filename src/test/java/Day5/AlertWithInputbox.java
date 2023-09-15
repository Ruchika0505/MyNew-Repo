package Day5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithInputbox {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.get("https://the-internet.herokuapp.com/javascript_alerts");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
			Thread.sleep(5000);
	
 Alert	alert =driver.switchTo().alert();
 System.out.println(alert.getText());
 alert.sendKeys("Welcome");
 alert.accept();
 //alert.dismiss();
 //validation
 
 String actual= driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
 
 String exp="Welcome";
 
 System.out.println("The actaual value :"+actual);
 System.out.println("The expected value :"+exp);
 
 if(actual.equals(exp))
 {
	 System.out.println("Test Passed");
 }
 else
 {
	 System.out.println("Test Failed");
 }
 
	}
}
