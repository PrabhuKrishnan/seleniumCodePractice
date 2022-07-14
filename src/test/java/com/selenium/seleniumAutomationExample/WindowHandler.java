package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class WindowHandler {
	
	WebDriver driver;
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
									
		//Parent window that ie  https://naukri.com
		String parentWindow = driver.getWindowHandle();
		
		//This set will have parent and child windows 
		Set<String> allWindows = driver.getWindowHandles();
		
		
		int windowSize = allWindows.size();
		System.out.println("Child Windows Size: "+windowSize );
		
		//Iterate the  allwindows to match with the child window
		for(String child : allWindows)
		{
			//comparing the child window with "parentWindow"
			//If the "parentWindow" is  not equal with child, then it will enter into if loop and process the child window
			if(!parentWindow.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				System.out.println("Child window title Name: "+ driver.getTitle());
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.close();
				
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title: "+ driver.getTitle());
		
		driver.switchTo().frame(0);
		
	}
	
	
	@AfterTest
	public void tear_down()
	{
		driver.quit();
	}
}
