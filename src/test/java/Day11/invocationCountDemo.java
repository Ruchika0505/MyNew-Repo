package Day11;

import org.testng.annotations.Test;

public class invocationCountDemo {

	@Test(invocationCount=5)
	
	void test()
	{
		System.out.println("Testing....");
	}
}
