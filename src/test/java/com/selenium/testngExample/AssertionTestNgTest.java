package com.selenium.testngExample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

 

public class AssertionTestNgTest {
	
	@Test()
	public void test_1()
	{
		SoftAssert softassertTest1 = new SoftAssert();
		
		System.out.println("Launch Browser...");
		softassertTest1.assertEquals(true, true,"Your browser launched");
		
		System.out.println("Login Method");
		softassertTest1.assertEquals(true, false,"Login Success");
		
		softassertTest1.assertAll();
	}

	
	@Test
	public void test_2()
	{
		
		SoftAssert softassertTest2 = new SoftAssert();
		
		System.out.println("Home page method");
		softassertTest2.assertEquals(true, true,"Home page logined");
		
		softassertTest2.assertAll();
		
	}
	
	
	
	
	
	
}
