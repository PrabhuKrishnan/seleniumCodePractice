package com.selenium.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumWaitExample {

	
	@BeforeTest
	public void setUp()
	{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void webdriverExpectedConditionsTest()
	{
		
		
		
		
	}
	
	

	@AfterTest
	public void tearDown()
	{
		
		
		
	}
	
	
	
}
