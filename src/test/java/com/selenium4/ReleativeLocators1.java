package com.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReleativeLocators1{
		
	
		@Test
		public void releativeLocators()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://automationbookstore.dev/");
			driver.manage().window().maximize();
			
			
			WebElement belowBook1 = driver.findElement(By.id("pid1"));
			WebElement toLeftOfBook6 = driver.findElement(By.id("pid6"));
			
			//to use the with method, import the static package manually from RelativeLocator packaage
			WebElement book5 = driver.findElement(with(By.tagName("li")).below(belowBook1).toLeftOf(toLeftOfBook6));
			String id = book5.getAttribute("id");
			System.out.println(id);
		}
		
	}

 
