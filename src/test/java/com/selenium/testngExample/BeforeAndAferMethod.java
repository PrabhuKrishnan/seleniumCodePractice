package com.selenium.testngExample;

import org.testng.annotations.Test;
import org.testng.annotations.*;


public class BeforeAndAferMethod {

	/*
	 * BeforeTest 
	 * 
	 * BeforeMethod
	 * Test
	 * AfterMethod
	 * 
	 * AfterTest
	 * 
	 */
	
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method...");
	}
	
	
	@AfterMethod
	public void afetrMethod()
	{
		System.out.println("After Method...");
	}
	
	//=========================@Test====================================
	@Test
	public void a_test()
	{
		System.out.println(" Test A");
		System.out.println();
	}
	
	@Test
	public void b_test()
	{
		System.out.println(" Test B");
		System.out.println();

	}
	
	@Test
	public void c_test()
	{
		System.out.println(" Test C");
		System.out.println();

	}
	
	@Test
	public void d_test()
	{
		System.out.println(" Test D");
		System.out.println();

	}
	
	//=========================End of @Test====================================
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test..");

	}
}
