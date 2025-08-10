package Utilities;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtilities implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = DriverManager.getDriver();
		ScreenshotUtilities Screenshot = new ScreenshotUtilities(driver);
		Screenshot.TakeScreenshot("FailedCases");
	}

}
