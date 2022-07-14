package com.selenium.selenium.expectedConditions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

	
	//Ref: https://www.lambdatest.com/blog/expected-conditions-in-selenium-examples/

	WebDriver driver;

	@BeforeTest
	public void beforeTEst()
	{

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}


	@Test
	public void alertIsPresentExpectionTest() throws InterruptedException
	{
		
		WebElement clickForJsAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		clickForJsAlert.click();
		
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alertPresent = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Alert window is present");
		alertPresent.accept();
		
		
		 
		
		Thread.sleep(3000);

	}


	@AfterTest
	public void AftetTest()
	{

		driver.quit();
	}


}





















