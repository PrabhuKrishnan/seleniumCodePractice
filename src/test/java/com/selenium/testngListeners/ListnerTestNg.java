package com.selenium.testngListeners;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class ListnerTestNg  extends TestListenerAdapter{

	public void onTestStart(ITestResult result) {
		
		System.out.println("TEST CASE STARTED....");
		
	}

	public void onTestSuccess(ITestResult result) {
		
		int status = result.getStatus();
		System.out.println("status: " +status);
		
		String instanceName = result.getInstanceName();
		System.out.println("instanceName: "+ instanceName);
		
		String testName = result.getName();
		System.out.println("Name: " + testName);
		
		System.out.println("TEST CASE EXECUTION SUCCESS...." );
		
	}

	public void onTestFailure(ITestResult result) {

      System.out.println("TEST CASE FAILED....");
		
	}

	public void onTestSkipped(ITestResult result) {
		
		
		System.out.println("TEST CASE SKIPPED....");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TEST CASE FAILED WITH SUCCESS PERCENTAGE....");
		
	}

	public void onStart(ITestContext context) {
		System.out.println("TEST CASE STARTED....");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("TEST CASE EXECUTION FINISHED....");
		
	}
	
}
