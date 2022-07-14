package com.selenium.seleniumAutomationExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionDemo {

	WebDriver driver;
	
	 
	
	@BeforeTest
	public void beforeTEst()
	{

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

		
	@Test
	public void Test() throws InterruptedException
	{
		WebElement mouseOver = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement seachValue = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement contextClick = driver.findElement(By.xpath("//a[normalize-space()='Books']"));

		Actions action = new Actions(driver);
		
		//action.moveToElement(mouseOver).perform();
		
		
		action.moveToElement(seachValue).click().keyDown(Keys.SHIFT).sendKeys("camera").perform();
		Thread.sleep(3000);
		
		action.moveToElement(seachValue).keyDown(Keys.CONTROL).sendKeys("a").perform();
		
		//action.contextClick(contextClick).perform();
		Thread.sleep(3000);
		
		 

		
		
	}
	
	@AfterTest
	public void AftetTest()
	{
		
		driver.quit();
	}

	 
}
