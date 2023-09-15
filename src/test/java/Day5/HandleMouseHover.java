package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseHover {

	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	WebElement desktop =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
    WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions act= new Actions(driver);
	
	//Mouse hover
	
//	act.moveToElement(desktop).moveToElement(mac).click().build().perform(); // creating actions than perform
	act.moveToElement(desktop).moveToElement(mac).click().perform(); // directly performing actions 
	}
}