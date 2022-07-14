package com.selenium.JSEDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebElement element;

		System.setProperty("webdriver.chrome.driver", "D:\\Automation Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("prabhu.krishnan@yahoo.com");
		element = driver.findElement(By.xpath("//input[@id='persistent']"));
		//element.click();
		 

		JavascriptExecutor jse =  (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", element);

		
	 
	}

}
