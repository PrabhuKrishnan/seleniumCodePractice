package com.selenium.Log4jExamples;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoggersOperation {

	Logger logger;
	WebDriver driver;
    @Test	
	public void  tetsCase_a(){
		
	logger = Logger.getLogger("LoggersOperation");
	PropertyConfigurator.configure("Log4j.properties"); 
	
	String ChromeDriverPath = ("H:\\Automation Testing\\SeleniumLearn\\Jars\\chromedriver_win32\\");
	System.setProperty("webdriver.chrome.driver", ChromeDriverPath+"chromedriver.exe");
    
    ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	options.addArguments("disable-infobars");
	
	logger.info("ChromeDriver instance Created...");
	driver = new ChromeDriver(options);
	
	logger.info("Browser Maximized");
	driver.manage().window().maximize();
	
	logger.info("Loading https://www.redbus.in");
	driver.navigate().to("https://www.redbus.in/");
	
	logger.info("waiting for 30 seconds...");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	logger.info("Page loaded successfully...");
	}
    
	@AfterTest
	public void tearDown()
	{
		logger.info("Closing Browser...");
		driver.quit();

	}
}
