package Pages;
import Utilities.WaitUtilities;
import Utilities.ElementUtilis;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedPage {
	protected WebDriver  driver;

	public AdvancedPage(WebDriver driver) {
		this.driver = driver;
	}

	public void AdvancePageNavigation() {
		try {
			WebElement UpgradeButton = driver.findElement(By.xpath("//a[@target='_blank']//button[@type='button']"));
			WaitUtilities.Elementtobeclickable(driver, UpgradeButton, 15);
			System.out.println(UpgradeButton.getTagName());
			UpgradeButton.click();
			String parentWindow = driver.getWindowHandle();
			Set<String> allwindows = driver.getWindowHandles();
			for (String window: allwindows) {
				driver.switchTo().window(window);
				System.out.println(window);
				if (driver.getTitle().contains("Upgrde to Advanced")) {

					System.out.println("NewWindow Handle: "+driver.getTitle());
					break;
				}
			}
			ElementUtilis.waitforElement(driver, "//img[@alt='OrangeHRM Logo']", "HRMLogo");
			ElementUtilis.ElementDisplayed(driver, "//a[contains(.,'Solutions')]", "Solutionslink");
			ElementUtilis.ElementDisplayed(driver, "//a[contains(.,'Why OrangeHRM')]", "WhyOrangeHRMlink");
			ElementUtilis.ElementDisplayed(driver, "//a[text()='Resources']", "Resourceslink");
			ElementUtilis.ElementDisplayed(driver, "//a[text()='Company']", "CompanyLink");
			ElementUtilis.ElementDisplayed(driver, "//ul[@class='navbar-nav ms-auto web-menu']//img[@alt='language- icon']", "WebImage");
			ElementUtilis.ElementDisplayed(driver, "//ul//select[@name='locale']", "LanguageDropdown");
			ElementUtilis.ElementDisplayed(driver, "//ul//button[text()='Book a Free Demo']", "BookaFreeDemo");
			ElementUtilis.ElementDisplayed(driver, "//a[text()='Pricing']", "PricingLink");

		}catch (NoSuchElementException e) {
			System.out.print(e.getMessage());
			throw e;
		}


	}

}
