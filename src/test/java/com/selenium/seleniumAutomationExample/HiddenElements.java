package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HiddenElements {
	WebDriver driver;
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//This will return element not visible exception,
		//because it have two element with same attribute value and one is hidden

		//driver.findElement(By.id("male")).click(); - the element has the attribute as hidden in the input tag

		//To overcome the above problem we have to use the below approach
		List<WebElement> radioButton = driver.findElements(By.id("male"));

		int count=radioButton.size();	

		//Getting the x coordinate value by using the method getLocation();
		//In checking if x is zero then its an hidden element which will not have coordinate(its value will be zero)
		//if the value of x in not zero, then it will click the element

		 	for(int i=0;i<count; i++ )
		{
			WebElement element = radioButton.get(i);

			int x = element.getLocation().getX();
			System.out.println("X value is:" + x);

			if(x!=0)
			{
				element.click();
				break;
			}


		}

		  

		 



	}


	@AfterTest
	public void tear_down()
	{
		driver.quit();
	}

}
