package com.selenium.seleniumAutomationExample;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;


public class ChromeTest{

	
	WebDriver driver;

    @BeforeTest
	public void setUp() {
		
		
		String ChromeDriverPath = "C:/Users/venkat/Desktop/SeleniumLearn/Jars/chromedriver_win32/";
		System.setProperty("webdriver.chrome.driver", ChromeDriverPath+"chromedriver.exe");
	    
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
}
