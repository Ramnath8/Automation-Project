package Test;
import Pages.LoginPage;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Utilities.ScreenshotUtilities;
import BaseTest.BaseTest;

public class LoginPageValidation extends BaseTest{
	
	

	@Test (priority =1)
	@Parameters({"username", "Password"})
	public void LoginTest(@Optional("Admin")String Username, @Optional("admin123") String Password) {
		LoginPage page = new LoginPage(driver);
		page.Login(Username, Password);
	}
	
	@Test(priority=2, dependsOnMethods="LoginTest")
	public void PageValidation() {
		LoginPage page = new LoginPage(driver);
		page.loginpageValidation();
	}
	
	@Test ()
	public void ResetPasswordValidation() {
		
	}
}
