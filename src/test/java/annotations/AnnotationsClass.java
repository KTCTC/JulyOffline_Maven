package annotations;

import org.testng.annotations.Test;

public class AnnotationsClass extends TestBase{
	@Test
	public void verifyUserCanLoginWithValidCredentials() {
		System.out.println("verify UserCanLoginWithValidCredentioals");
		
	}

	@Test
	public void verifyUserCanNotLoginWithInvalidUserNameAndValidPassword() {
		System.out.println("verifyUserCanNotLoginWithInvalidUserNameAndValidPassword");
	}

		
}
