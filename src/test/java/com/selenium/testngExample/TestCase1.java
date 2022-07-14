package com.selenium.testngExample;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test 
	public void testCase_1()
	 {
		 System.out.println("Executing testCase_1....");
		 Assert.fail();
	 }
	
}
