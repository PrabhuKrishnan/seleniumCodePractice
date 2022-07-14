package com.selenium.testngExample;

 

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestCases {

	@Test
	public void  login()
	{
		
		System.out.println("Account Login");
		Assert.fail();
	}
	
	@Test(dependsOnMethods={"login"})
	public void accountInfo()
	{
		
		System.out.println("Accoubt Info");
	}
	
	@Test(dependsOnMethods={"login","accountInfo"})
	public void logOutAccount()
	{
		System.out.println("LogOut Account");
	}
}
