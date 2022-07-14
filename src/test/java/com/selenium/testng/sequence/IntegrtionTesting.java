package com.selenium.testng.sequence;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IntegrtionTesting {

	@BeforeGroups
	public void beforeGroups()
	{
		System.out.println();
		System.out.println("Before Groups");
		System.out.println();
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println();
		System.out.println("Before Suite");
		System.out.println();
	}
		
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
		System.out.println();
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
		System.out.println();
	}
	
	
	@BeforeMethod
	public void testSetup()
	{
		System.out.println("Before Method");
	}

	@Test()
	public void test_A()
	{
		System.out.println("test_A");
	}
	
	@Test()
	public void test_B()
	{
		System.out.println("test_B");
	}

	

	@AfterMethod
	public void afterMethod()
	{
		
	System.out.println("After  Method");
	System.out.println();

	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
		System.out.println();
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
		System.out.println();
	}
	
	@AfterSuite
	public void afterSuite()
	{
		//System.out.println();
		System.out.println("After Suite");
		System.out.println();
	}
	

	@AfterGroups
	public void afterGroups()
	{
		System.out.println();
		System.out.println("After Groups");
		System.out.println();
	}

	



}
