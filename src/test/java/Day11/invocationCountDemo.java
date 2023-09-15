package Day11;

import org.testng.annotations.Test;

public class invocationCountDemo {

	@Test(invocationCount=10)
	
	void test()
	{
		System.out.println("Testing....");
	}
}
