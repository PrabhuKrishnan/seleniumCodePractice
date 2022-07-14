package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

	public static void main(String[] args) {

		/*
		 * driver.switchTo().frame(0);
		 * driver.switchTo().frame(“iframe1”);
		 * driver.switchTo().frame(“id of the element”);
		 * 
		 * To switch back to main frame
		 * driver.switchTo().defaultContent()
		 * driver.switchTo().parentFrame();
		 * driver.switchTo().frame(0)
		 */
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");

		 //defaultcontent and parentframe
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.id("content")).getText());

		driver.quit();

	}

}
