package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClassOperation {


	WebDriver driver;

	@BeforeTest
	public void setup()
	{

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


	}

	@Test
	public void actionClassTest()
	{
		
		System.out.println("Selenium Action Class :");

		WebElement mouseOver =  driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action = new  Actions(driver);

		action.moveToElement(mouseOver).perform();
		//action.contextClick(mouseOver).build().perform();

		/*
		action.click(mouseOver).build().perform();
		action.doubleClick().build().perform();
		action.keyDown(Keys.SHIFT).build().perform();
		action.pause(1).build().perform();
		 */

	}


	@AfterTest
	public void afterTest()
	{
		driver.quit();

	}








}
