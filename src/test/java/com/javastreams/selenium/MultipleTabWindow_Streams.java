package com.javastreams.selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleTabWindow_Streams {
	
	
	@Test
	public void multipleWindowHandling()
	{
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.amazon.in/");
		
		 Set<String> winID = driver.getWindowHandles();
		 
		 //Java 7 impl
			/*
			 * for (String winID : windwosId) {
			 * 
			 * String title = driver.switchTo().window(winID).getTitle();
			 * System.out.println(title); }
			 */
		
		 //using streams, here forEach from consumer is used to get the title
		 winID.forEach(w->System.out.println(driver.switchTo().window(w).getTitle()));
		 
		
		
	}

}
