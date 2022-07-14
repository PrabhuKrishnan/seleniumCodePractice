package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Reporter;

import com.google.common.base.Function;

public class FluentWaitTest {

	public void test()
	{
		
		
		WebDriver driver ;
		System.setProperty("webdriver.gecko.driver","H:\\Automation Testing\\SeleniumLearn\\Jars\\FirefoxGeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		Reporter.log("Driver Instance Created...");
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://opensource.demo.orangehrmlive.com/");
		Reporter.log("Orange HRM site Launched...");

		driver.findElement(By.cssSelector("input[name='txtUsername'][type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='txtPassword'][id='txtPassword']")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[type='submit'][name='Submit']")).click();
        Reporter.log("Fetching Current URL");
        System.out.println(driver.getCurrentUrl()); 
		
		/*
		 * Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(30, TimeUnit.SECONDS) .pollingEvery(10, TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement ele = fluentWait.until(new Function<WebDriver,WebElement>() {
		 * public WebElement apply(WebDriver driver) { return
		 * driver.findElement(By.id("foo")); }
		 * 
		 * });
		 */
	}
}
