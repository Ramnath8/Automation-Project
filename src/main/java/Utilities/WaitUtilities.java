package Utilities;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitUtilities {
	protected WebDriver driver;
	public WaitUtilities(WebDriver driver) {
		this.driver =driver;
	}
	
	public static WebElement Eleemnttobevisible(WebDriver driver, WebElement Element, int Timeinseconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeinseconds));
		return wait.until(ExpectedConditions.visibilityOf(Element));
	}
	
	public static WebElement Eleemnttobeclickable(WebDriver driver, WebElement Element, int Timeinseconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeinseconds));
		return wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
	
	public static WebElement FluentWait1(WebDriver driver, int Timeinseconds, int PollingSeconds, WebElement element ) {
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(Timeinseconds))
				.pollingEvery(Duration.ofSeconds(PollingSeconds))
				.ignoring(NoSuchElementException.class);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
}
