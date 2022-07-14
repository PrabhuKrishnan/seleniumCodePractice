package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOperations {

	public static void main(String[] args) {
		 
		
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("alertbtn")).click();
		
		String text  = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		driver.quit();
		
		
		
	}

}
