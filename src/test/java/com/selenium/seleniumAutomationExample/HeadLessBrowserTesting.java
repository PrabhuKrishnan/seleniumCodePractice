package com.selenium.seleniumAutomationExample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowserTesting {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\Automation Jars\\chromedriver.exe");

		// chromeDriver headless
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		driver = new ChromeDriver(options); 
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("The title of the page is: " + driver.getTitle());
		
		
		
		
		

	}
}
