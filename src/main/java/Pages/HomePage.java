package Pages;
import Utilities.WaitUtilities;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void DashBoardValiadtion() {
		WebElement DashBoardHeading = driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]"));
		WebElement TimeAtWorkHeading = driver.findElement(By.xpath("//p[contains(.,'Time at Work')]"));
		WebElement MyActionsHeading = driver.findElement(By.xpath("//p[contains(.,'My Actions')]"));
		WebElement QuickLaunchHeading = driver.findElement(By.xpath("//p[contains(.,'Quick Launch')]"));
		WebElement BuzzLatestPostHeading = driver.findElement(By.xpath("//p[contains(.,'Buzz Latest Posts')]"));
		WebElement EmployeesonLeaveHeading = driver.findElement(By.xpath("//p[contains(.,'Employees on Leave Today')]"));
		WebElement EmployeeDistributionHeading = driver.findElement(By.xpath("//p[contains(.,'Employee Distribution')]"));
		WebElement EmployeeDistributionByLocationHeading = driver.findElement(By.xpath("//p[contains(.,'Employee Distribution by Location')]"));
		
		try {
			WaitUtilities.Elementtobevisible(driver, DashBoardHeading, 10);
			if (DashBoardHeading.isDisplayed()) {
				System.out.println(TimeAtWorkHeading.isDisplayed());
				System.out.println(MyActionsHeading.isDisplayed());
				System.out.println(QuickLaunchHeading.isDisplayed());
				System.out.println(BuzzLatestPostHeading.isDisplayed());
				System.out.println(EmployeesonLeaveHeading.isDisplayed());
				System.out.println(EmployeeDistributionHeading.isDisplayed());
				System.out.println(EmployeeDistributionByLocationHeading.isDisplayed());

			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}

	}
}
