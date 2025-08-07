package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import BaseTest.BaseTest;


public class HomePageValidation extends BaseTest{
	@Test
	public void Homepageverification(@Optional("Admin") String Username, @Optional("admin123") String Password) {

		LoginPage page = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		page.Login(Username, Password);
		home.DashBoardValiadtion();

	}
}
