package com.selenium.screenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(FailedTestCaseListener.class)
public class FaileTestCaseScreenshotTest extends Base{
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}

	
	@Test
	public void loginPageTest()
	{
		Assert.assertEquals(true, false);
	
	}
	
	@Test
	public void homePageTest()
	{
		Assert.assertEquals(true, false);
	
	}
	
	@Test
	public void productPageTest()
	{
		Assert.assertEquals(true, false);
	
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
}
