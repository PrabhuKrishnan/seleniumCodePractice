package com.selenium.seleniumAutomationExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver;
	@Test
	@Parameters("browser")
	public void browserName(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "H:\\Automation Testing\\SeleniumLearn\\Jars\\FirefoxGeckoDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
			driver  = new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.quit();
		
	}
}
