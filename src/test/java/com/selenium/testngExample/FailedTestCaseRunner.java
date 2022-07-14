package com.selenium.testngExample;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FailedTestCaseRunner {

	public static void main(String[] args) {
		
		TestNG runner = new TestNG();
		
		List<String> failedTestCasePath = new ArrayList<String>();
		
		failedTestCasePath.add("H:\\Automation Testing\\workspace\\SeleniumTesting\\test-output\\failedTestCaseExecution\\testng-failed.xml");
		
		runner.setTestSuites(failedTestCasePath);
		
		runner.run();
		
	}
}
