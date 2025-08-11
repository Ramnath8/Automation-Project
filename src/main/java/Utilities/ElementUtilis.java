package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 * Used this class to print Element Status
 * 
 * 
 * 
 */
public class ElementUtilis {
	
	//ElementDispayed or not
	public static void ElementDisplayed(WebDriver driver, String xpath, String ElementName) {
		WebElement Element = driver.findElement(By.xpath(xpath));
		if (Element.isDisplayed()) {
			System.out.println(ElementName+" is displayed");
		} else {
			throw new NoSuchElementException(ElementName + " is not displayed");
		}
	}
	
	//ElementWaiting:
	public static void waitforElement(WebDriver driver, String xpath, String ElementName) {
		WebElement Element = driver.findElement(By.xpath(xpath));
		try {
			if (WaitUtilities.Elementtobevisible(driver, Element, 10).isDisplayed()) {
				System.out.println(ElementName+ "Element loaded Successefully");
			}
		} catch (TimeoutException e) {
			throw new TimeoutException(ElementName+" Element not loaded in specifie time");
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException (ElementName+" Element not loaded in specifie time");
		}
	}
	
	public static void ElementDisplayed2(WebDriver driver, String xpath, String ElementName) {
		WebElement Element = driver.findElement(By.xpath(xpath));
		if (Element.isDisplayed()) {
			System.out.println(ElementName+" is displayed");
		} else {
			throw new NoSuchElementException(ElementName + " is not displayed");
		}
	}
}
