package annotations;

import org.testng.annotations.Test;

public class AnnotationsClass2 extends TestBase{
	@Test
	public void verifyProductCanBeAddedInCart() {
		System.out.println("verify Product Can Be Added InCart ");
		
	}

	@Test
	public void verifyUserCanCheckOutAfterProductAddedInCart() {
		System.out.println("verify User Can Check Out   AfterProductAddedInCart");
	}

		
}
