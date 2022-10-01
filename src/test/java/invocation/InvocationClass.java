package invocation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationClass {
	static int count=0;
	@Test (invocationCount = 5)
	public void sample()
	{
		count++;
		System.out.println("Sample method");
		if (count==3)
		{
			Assert.assertTrue(false);
		}
		
		
		
	}
	

}
