package Day10_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ThirdTest {
 	
@Test
void test1()
{
	System.out.println("This is test1");
}

	@Test(priority=11)
void test2()
{
		System.out.println("This is test2");
}
	
	@Test
void test3()
{
		
		System.out.println("This is test3");
}

}