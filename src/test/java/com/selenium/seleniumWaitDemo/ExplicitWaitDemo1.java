package com.selenium.seleniumWaitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo1 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty(
				"webdriver.chrome.driver",
				"G:\\Profession\\Automation Files\\selenium Jars\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebElement element = driver.findElement(By.cssSelector("a[href*='loadAjax']"));
		element.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
	 
		String text = driver.findElement(By.id("results")).getText();
		System.out.println(text);
		
		
		
		
		
	}

}
