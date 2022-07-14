package com.selenium.testngExample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgOrder {

	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
	  System.out.println("Before Test");	
	}
	
	@Test
	public void Test()
	{
	  System.out.println(" Test");	
	}
	
	
	@AfterTest
	public void afterMethod()
	{
	  System.out.println("afterMethod");	
	}
	
	
	
	
	
	
	
	
}
