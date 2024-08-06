package Selenium_Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login_grid_demo {
	//DesiredCapabilities
	//RemoteWebdriver
	
	WebDriver driver;
	
@Test(priority=1)
	void setup() throws MalformedURLException
	{
	String nodeURL= "http://10.10.16.58:";
	//DesiredCapabilities cap = new DesiredCapabilities();
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);	
	
	driver= new RemoteWebDriver(new URL(nodeURL),cap);
	
	}


@Test(priority=2)
	void login() {
    driver.get("http://practice.automationtesting.in/my-account/");
	driver.findElement(By.name("username")).sendKeys("ruchika@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Test@selenium123");
	driver.findElement(By.name("login")).click();
	
	String captext=driver.findElement(By.xpath("//strong[normalize-space()='ruchika']")).getText();
	
	Assert.assertEquals(true, captext.contains("ruchika"));
	
	driver.close();
	}
}
