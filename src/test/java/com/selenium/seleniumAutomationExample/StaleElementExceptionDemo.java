package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaleElementExceptionDemo {
	
	
	WebDriver driver;

	@BeforeTest
	public void beforeTest()
	{
		
		/*
		 StaleElementReferenceException
		 
		 - stale means old,decayed, no longer fresh 
		 - stale elements means an old element or no longer available element 
		 - If the changes then the webElement goes stale 
		 - when this happens you will need to refresh your reference, or find the element again
		 
		 */
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@Test
	public void test() throws InterruptedException
	{
		
		WebElement homeButton =   driver.findElement(By.xpath("//a//button[@class='btn btn-primary']"));
		homeButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		try
		{
		homeButton.click();
		}
		catch (StaleElementReferenceException  e) {
			homeButton =   driver.findElement(By.xpath("//a//button[@class='btn btn-primary']"));
			homeButton.click();
		}
		
	}
	}

 
