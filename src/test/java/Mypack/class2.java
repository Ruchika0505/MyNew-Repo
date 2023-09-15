package Mypack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 {

	@Test
	void xyz()
	{
		System.out.println("this is xyz from class2");
	}
	@AfterTest
	void n()
	{
		System.out.println("this is ending Test method....");
	}
}
