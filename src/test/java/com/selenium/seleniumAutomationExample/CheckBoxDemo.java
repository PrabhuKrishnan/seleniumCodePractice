package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBoxDemo {
	
 
	WebDriver driver;

	@BeforeTest
	public void beforeTest()
	{
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test
	public void test() throws InterruptedException
	{
		
		//code to select the checkbox
		WebElement checkBoxElement  = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		checkBoxElement.click();
		
		
		String checkBoxName = checkBoxElement.getAttribute("value");
		System.out.println("The selected check box Name: " +checkBoxName);
		
		//code to select the dropdown using the check box name stored in variable checkBoxName
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropDown);
		select.selectByValue(checkBoxName);
	 
		
		//code to enter the checkbox name in the text box 
		driver.findElement(By.id("name")).sendKeys(checkBoxName);
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText =driver.switchTo().alert().getText();	
		System.out.println("Alert Message: "+ alertText);
		driver.switchTo().alert().accept();
		
		String[] verifyAlertMessage = alertText.split(" ");
		
		
		for(String values : verifyAlertMessage)
		{
			
			if(values.contains(checkBoxName))
			{
				System.out.println(values);
				break;
			}
			
			
		}
		
	}
	
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
		System.out.println("close");
	}

}
