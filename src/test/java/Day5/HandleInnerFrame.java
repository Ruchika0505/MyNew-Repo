package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInnerFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
	//frame1 
WebElement frm1=driver.findElement(By.xpath("/html/frameset/frame[1]"));

driver.switchTo().frame(frm1);

driver.findElement(By.name("mytext1")).sendKeys("1111");

driver.switchTo().defaultContent();

//frame 3


		
WebElement frm3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));

driver.switchTo().frame(frm3); //webelement

driver.findElement(By.name("mytext3")).sendKeys("3333");

driver.switchTo().frame(0);

driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();

driver.switchTo().defaultContent();

//frame 2
//frame4
//frame5
	}
	
}
