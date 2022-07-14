package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BrowserTabs {
	WebDriver driver;
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("Google.com");
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("facebook.com");
		driver.findElement(By.xpath("//a[@href='http://www.facebook.com']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("Yahooo.com");
		driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		String parentTab =  driver.getWindowHandle();
		System.out.println("Parent Tab Title: "+ driver.getTitle());
		
		Set<String> allTabs = driver.getWindowHandles();
		
		ArrayList<String> tabs = new ArrayList<String>(allTabs);
		//tabs.addAll(allTabs);
		
		System.out.println("Tabs at Index zero: "+tabs.get(0)); 
		
        driver.switchTo().window(tabs.get(0));
        System.out.println("Tab 0 Title: "+ driver.getTitle());
        
        driver.switchTo().window(tabs.get(1));
        System.out.println("Tab 1  Title: "+ driver.getTitle());
        
        driver.switchTo().window(tabs.get(2));
        System.out.println("Tab 2  Title: "+ driver.getTitle());
        
        driver.switchTo().window(tabs.get(3));
        System.out.println("Tab 3 Title: "+ driver.getTitle());
        
       
         
	}
	
	
	@AfterTest
	public void tear_down()
	{
		driver.close();
		driver.quit();
	}
}
