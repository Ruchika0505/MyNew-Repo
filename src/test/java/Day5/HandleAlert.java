package Day5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	
	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	Thread.sleep(5000);
	Alert alertwindow =driver.switchTo().alert();
	Thread.sleep(5000);
	System.out.println(alertwindow.getText());
	
	Thread.sleep(5000);
	//alertwindow.accept();//this will click on ok button in alert window
	
	alertwindow.dismiss(); //this will click on cancel button in alert window
	}
}
