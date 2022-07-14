package com.selenium.testngExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgTestDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

	}
	
	@Test
	public void googleTitleTest()
	{
		String googlePageTitle = driver.getTitle();
		System.out.println("Google Page Title: " + googlePageTitle);
	}
	
	@Test
	public void googleLogoTest()
	{
		boolean googleLogoIsDisplayed  = driver.findElement(By.xpath("//div[@class='k1zIA rSk4se']//img")).isDisplayed();
		System.out.println(googleLogoIsDisplayed);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
