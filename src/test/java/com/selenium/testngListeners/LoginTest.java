package com.selenium.testngListeners;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest {

	
	@Test(priority = 1)
	 void LoginByGmail()
	{
		System.out.println("Login by Gmail");
		Assert.assertEquals("prabhu", "prabhu");
		
	}
	
	@Test(priority = 2)
	 void LoginByFacebook()
	{
		System.out.println("Login by Facebook");
		Assert.assertEquals("prabhu", "prabhu");
		
	}
	
}
