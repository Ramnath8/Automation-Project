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
	 //Validating Loginpage
	 public void loginpageValidation() {
		 WaitUtilities wait = new WaitUtilities(driver);
		 WebElement UsernameInput = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 WebElement PasswordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		 WebElement Header = driver.findElement(By.xpath("//h5[text()='Login']"));
		 WebElement OrangeLogo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		 WebElement Usenamelabelpara = driver.findElement(By.xpath("//p[contains(.,'Admin')]"));
		 WebElement Passwordlabelpara = driver.findElement(By.xpath("//p[contains(.,'admin123')]"));
		 WebElement LinkText = driver.findElement(By.xpath("//p[contains(.,'Forgot your')]"));
		 //wait.Eleemnttobevisible(driver, Header, 10);
		 System.out.println(OrangeLogo.isDisplayed());
		 System.out.println(Usenamelabelpara.isDisplayed());
		 System.out.println(Passwordlabelpara.isDisplayed());
		 System.out.println(LinkText.isDisplayed());
		 System.out.println(UsernameInput.isEnabled());
		 System.out.println(PasswordInput.isEnabled());
		 
	 }
	 public void Login(String Username,String Password) {
		 WebElement UsernameInput = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		 WebElement PasswordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		// WaitUtilities wait = new WaitUtilities(driver);
		 WaitUtilities.Elementtobevisible(driver, Login, 5);
		 UsernameInput.sendKeys(Username);
		 PasswordInput.sendKeys(Password);
		 Login.click();
		 
		 
	 }
}
