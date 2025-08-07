package Test;
import Pages.LoginPage;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class LoginPageValidation extends BaseTest{
	

	@Test
	public void LoginTest() {
		LoginPage page = new LoginPage(driver);
		page.Login();
	}
}
