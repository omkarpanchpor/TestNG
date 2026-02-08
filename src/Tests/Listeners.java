package Tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	//	System.out.println("I sucessfully executed Listeners pass code");
	}
	
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		// screenshot code
		//response if API failure
		System.out.println("I sucessfully executed Listeners fail code " + result.getName());
		
	}
	
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	

	
}

