package Mypack;

import org.testng.annotations.*;

public class class1 {

	@Test
	void abc()
	{
		System.out.println("this is abc from class1");
	}
	@BeforeTest
	void m()
	{
		System.out.println("this is starting Test method....");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is Before suite method....");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("this is After suite method....");
	}
}
