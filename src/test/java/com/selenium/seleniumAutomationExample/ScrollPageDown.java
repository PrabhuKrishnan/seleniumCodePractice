package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageDown {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		 JavascriptExecutor jse =(JavascriptExecutor)driver;
		 jse.executeScript("scroll(0,400)");
	}

}
