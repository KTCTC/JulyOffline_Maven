package priority;

import org.testng.annotations.Test;

public class PriorityClass2 {
	@Test (priority = 1, dependsOnMethods = "verifyUserCanNotLoginWithInvalidUserNameAndValidPassword")
	public void verifyUserCanLoginWithValidCredentials() {
		System.out.println("verify UserCanLoginWithValidCredentioals");
		
	}

	@Test (priority = 10)
	public void verifyUserCanNotLoginWithInvalidUserNameAndValidPassword() {
		System.out.println("verifyUserCanNotLoginWithInvalidUserNameAndValidPassword");
	}
	
	@Test (priority = 3)
	public void verifyUserCanSendEmail()
	{
		System.out.println("verify User Can Send Email");
	}

		

}
