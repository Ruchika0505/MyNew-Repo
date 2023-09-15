package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
				
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
	
		Actions act=new Actions(driver);
		
		//Min Slider
		
	WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
	System.out.println("Before moving the slider the location is :"+min_slider.getLocation()); //59,250
	
	act.dragAndDropBy(min_slider, 100, 250).perform();
	
	System.out.println("After moving the slider the new location is :" +min_slider.getLocation());//161,250
	
	
}
}