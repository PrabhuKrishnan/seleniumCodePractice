package com.selenium.testngRetryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerCondition  implements IRetryAnalyzer{
	
	
	//RetryAnalyzer implemented in the class RetyAnalyzerTest.class
	
	int counter =0;
	int retryLimit =3;

	public boolean retry(ITestResult result) {
		
		 
		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		else
			
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
