package com.selenium.extentreports;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class GenerateExtendReport {
	
	ExtentReports extentReport; //specify the location and info about the reports
	ExtentTest extentTest;//what details should be populated in the report 
	
	@BeforeTest
	public void startReport()
	{
	   //System.getProperty("user.dir") + "/test-output/myReport.html",true)
		extentReport = new ExtentReports(System.getProperty("user.dir") + "/test-output/myReport.html",true);
		extentReport.addSystemInfo("HOST NAME","Local Host");
		extentReport.addSystemInfo("Envirnoment","QA");
		extentReport.addSystemInfo("User Name","Prabhu Krishnan");
		extentReport.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		
		
	}
	
	@Test
	public void extentReportTestPass()
	{
		
		extentTest = extentReport.startTest("extentReportTest");
		Assert.assertTrue(true);
		extentTest.log(LogStatus.PASS, "Assert Pass as condition is true");
	}
	
	
	@Test
	public void extentReportTestFail()
	{
		
		extentTest = extentReport.startTest("extentReportTestFail");
		Assert.assertTrue(false);
		extentTest.log(LogStatus.FAIL, "Assert Fail as condition is False");
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			extentTest.log(LogStatus.FAIL, result.getThrowable());
		}
		extentReport.endTest(extentTest);
	}
	
	
	@AfterTest
	public void tearDown()
	{
		extentReport.flush();
	}
	
	
	
	

}
