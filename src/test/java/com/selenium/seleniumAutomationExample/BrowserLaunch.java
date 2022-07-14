package com.selenium.seleniumAutomationExample;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class BrowserLaunch {
	
	protected WebDriver driver ;
	
	@BeforeTest
	public void setUp(){
	File file = new File("D:/Users/prabhu.k/Desktop/Automation/IEDriverServer_Win32_2.38.0/IEDriverServer.exe");
	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	/*
	 * DesiredCapabilities capabilites = DesiredCapabilities.internetExplorer();
	 * capabilites.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,
	 * "http://www.caisis.org/demo/Login.aspx");
	 * capabilites.setCapability(InternetExplorerDriver.
	 * INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	 * capabilites.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
	 * UnexpectedAlertBehaviour.ACCEPT)
	 */;
	driver =  new InternetExplorerDriver();
	driver.manage().window().maximize();
	}
	
	public void  implictWait(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
}
