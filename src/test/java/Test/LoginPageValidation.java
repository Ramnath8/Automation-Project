package Test;
import Pages.LoginPage;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class LoginPageValidation extends BaseTest{
	
	

	@Test
	@Parameters({"username", "Password"})
	public void LoginTest(@Optional("Admin")String Username, @Optional("admin123") String Password) {
		LoginPage page = new LoginPage(driver);
		page.Login(Username, Password);
	}
	
	@Test
	public void PageValidation() {
		LoginPage page = new LoginPage(driver);
		page.loginpageValidation();
	}
	
}
