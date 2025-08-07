package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.WaitUtilities;

public class LoginPage {
	protected WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
		 this.driver =driver;
	 }
	 
	 public void Login() {
		 WaitUtilities wait = new WaitUtilities(driver);
		 WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		 wait.Eleemnttobevisible(driver, Login, 5);
		 
		 Username.sendKeys("Admin");
		 Password.sendKeys("admin123");
		 Login.click();
		 
		 
		 
	 }
}
