package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import BaseTest.BaseTest;

@Listeners
public class HomePageValidation extends BaseTest{
	@Test(priority=1)
	@Parameters({"Admin", "admin123"})
	public void Homepageverification(@Optional("Admin") String Username, @Optional("admin123") String Password) {

		LoginPage page = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		page.Login(Username, Password);
		home.DashBoardValiadtion();

	}
}
