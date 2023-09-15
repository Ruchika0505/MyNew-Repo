package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to Selenium");
	
			Actions act=new Actions(driver);

			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();//cntrl +a 
			
			act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();//cntrl+c
			
			//act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform(); //Tab
			
			act.sendKeys(Keys.TAB).perform(); //only if you have to press single key.
			
			act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();//cntrl +v
	}
}