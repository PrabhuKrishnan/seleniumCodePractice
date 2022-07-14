package com.selenium.testng.passingparameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingParameterUsingTestng {


	WebDriver driver;

	@BeforeMethod
	@Parameters({"browser","url"})
	public void setup(String browser,String URL)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation Jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.out.println("Invalid browser selected...");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);

	}


	@Test
	@Parameters({"username","password"})
	public void Test(String username,String password)
	{
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).clear();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@name='txtPassword']")).clear();
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);

		WebElement loginButton =driver.findElement(By.xpath("//input[@name='Submit']"));
		loginButton.click();


	}


	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}







}
