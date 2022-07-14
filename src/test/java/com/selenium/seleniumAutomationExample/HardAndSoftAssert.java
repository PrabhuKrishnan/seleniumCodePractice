package com.selenium.seleniumAutomationExample;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class HardAndSoftAssert {

	@Test
	public void test1()
	{
		System.out.println("From test1 ");
		Assert.assertTrue(false);
		System.out.println("After test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("From test2");
		org.testng.Assert.assertTrue(true);
		System.out.println("After test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("From test3");
		SoftAssert sf  =  new SoftAssert();
		sf.assertTrue(false);
		System.out.println("After soft assert");
		sf.assertFalse(true);
		System.out.println("After test3");
		sf.assertAll();
	}
}
