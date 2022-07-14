package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;











import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class SeleniumWaitDemo {

	WebDriver driver = null;
	
	
	@BeforeTest
	public void TestSetUp()
	{
	
	  	driver = new ChromeDriver();
	  	driver.navigate().to("www.google.com");
	  	driver.manage().window().maximize();
	  	
	  	//Implicit Wait
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public void test()
	{
		
		WebElement element =  driver.findElement(By.id("name"));
		
		element.sendKeys("test");
		
		//Explict wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("locator")));
		driver.findElement(By.id("locator"));
		
		
		 
		
		
		  Wait<WebDriver> waitf = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
		  .pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class);
		  
		  //Arguments in the function method, 1st argument is for apply method input argument 
		  //second argument in function is for the return type for apply method 
		  //fluent wait function- It calling a method inside a function - It's a java concept call Anonymous inner class 
		  
		  WebElement fwait = waitf.until(new Function<WebDriver, WebElement>() 
		  {
		  
			  public WebElement apply(WebDriver driver) 
			  { 
				  return driver.findElement(By.id("name"));
				   
			  }
		  
		  
		  
		  });
		 	
		
	 	
	}
	
	
	@AfterTest
	public void tear_down()
	{
		driver.quit();
	}
}
