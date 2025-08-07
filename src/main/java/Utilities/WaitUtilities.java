package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitUtilities {
	protected WebDriver driver;
	public WaitUtilities(WebDriver driver) {
		this.driver =driver;
	}
	
	public  WebElement Eleemnttobevisible(WebDriver driver, WebElement Element, int Timeinseconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeinseconds));
		return wait.until(ExpectedConditions.visibilityOf(Element));
	}
	
	public  WebElement Eleemnttobeclickable(WebDriver driver, WebElement Element, int Timeinseconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeinseconds));
		return wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
	
	
}
