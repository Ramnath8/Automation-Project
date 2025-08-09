package Test;

import org.testng.annotations.Test;
import BaseTest.BaseTest;
import Pages.AdvancedPage;
import Pages.LoginPage;

public class UpgradeWindowValidation extends BaseTest {
	@Test
	public void UpgradeWindowPage() throws Exception {
		AdvancedPage advanced = new AdvancedPage(driver);
		LoginPage page = new LoginPage(driver);
		page.Login("Admin", "admin123");
		Thread.sleep(5000);
		advanced.AdvancePageNavigation();
		
		
	}
}
