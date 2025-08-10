package Pages;
import Utilities.*;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
public class HomePage {
	protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void DashBoardValiadtion() {
		try {
			ElementUtilis.waitforElement(driver, "//h6[contains(.,'Dashboard')]", "DashBoard");
			ElementUtilis.ElementDisplayed(driver, "//p[contains(.,'Time at Work')]", "TimeAtWorkHeading");
			ElementUtilis.ElementDisplayed(driver, "//p[contains(.,'My Actions')]", "MyActionsHeading");
			ElementUtilis.ElementDisplayed(driver, "//p[contains(.,'Quick Launch')]", "QuickLaunchHeading");
			ElementUtilis.ElementDisplayed(driver, "//p[contains(.,'Buzz Latest Posts')]", "BuzzLatestPostHeading");
			ElementUtilis.ElementDisplayed(driver, "//p[contains(.,'Employees on Leave Today')]", "EmployeesonLeaveHeading");
			ElementUtilis.ElementDisplayed(driver, "//p[contains(.,'Employee Distribution')]", "EmployeeDistributionHeading");
			ElementUtilis.ElementDisplayed(driver, "//p[contains(.,'Employee Distribution by Location')]", "EmployeeDistributionByLocationHeading");
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}

	}
}
