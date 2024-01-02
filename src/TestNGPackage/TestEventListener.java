package TestNGPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestEventListener implements ITestListener {
	
	@Override
	 public void onTestStart(ITestResult result) {
		Reporter.log(result.getTestName() + " Started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log(result.getTestName() + " Success");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log(result.getTestName() + " Failed");
	}
	

}
