package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_2 {

	public static void main(String[] args) {
		
	
	ChromeDriver driver =new ChromeDriver();
	
	//driver.manage().window().maximize(); //use for maximize the browser window
	
	//open url
	driver.get("http://www.automationpractice.pl/index.php");
	
	//find the no of sliders on the web page
	
	List <WebElement> sliders = driver.findElements(By.className("homeslider-container"));
    System.out.println("The no of sliders are :" + sliders.size());//no of element in the list

    //find the no of images in the home page
    List <WebElement> image = driver.findElements(By.tagName("img"));
    System.out.println("the no of images are: " + image.size() );
    
    // find the no of links available in the page
    
    List <WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println("the no of links are: " + links.size() );
    
    
     driver.close();
}
}

