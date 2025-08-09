package Utilities;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtilities implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		
		ScreenshotUtilities Screenshot = new ScreenshotUtilities();
		Screenshot.TakeScreenshot("FailedCases");
	}

}
