package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Testcase execution is started "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Testcase execution is completed "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Testcase is failed "+result.getName());
		UtilityClass.screenshotMethod(result.getName()+System.currentTimeMillis());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Testcase is skipped "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
