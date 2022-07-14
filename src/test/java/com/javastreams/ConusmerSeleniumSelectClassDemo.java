package com.javastreams;

import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ConusmerSeleniumSelectClassDemo 

{ 

	@org.testng.annotations.Test
	public void Test() throws InterruptedException
	{

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();	
	driver.get("https://demoqa.com/select-menu");
	
	WebElement element = driver.findElement(By.id("oldSelectMenu"));
	selectFromDropDown(e->e.selectByIndex(2),element);
	Thread.sleep(3000);
	 

	}

	public static void selectFromDropDown(Consumer<Select> consumer, WebElement element) {
		
	  consumer.accept(new Select(element));
		
	}
	

 

}
