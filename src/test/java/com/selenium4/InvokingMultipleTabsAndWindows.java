package com.selenium4;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleTabsAndWindows {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		/*
		  Notes: 
		  1.In selenium 4, we can get the data from the other website (tab/window)
		  2.And then pass on to the current window 
		  3.This can be achieved by using the new mehtod in selenium 4 switchTo().newWindow(WindowType.TAB)
		  5.And for switching the window use
		  
		   
		 */
		
		//this helps switching to the new tab and also WindowType.Window valid
		driver.switchTo().newWindow(WindowType.TAB);//switch to tab
		//driver.switchTo().newWindow(WindowType.WINDOW);//switch to window 
		
		//can also use the for each loop to switch to the windows 
		Set<String> getWindlowHandles = driver.getWindowHandles();
		Iterator<String> iterator = getWindlowHandles.iterator();
		
		String parentWindow = iterator.next(); //getting the parent window ID
		String childWindow = iterator.next(); //getting the child windwo ID
		driver.switchTo().window(childWindow);
		
		driver.get("https://rahulshettyacademy.com");
		
		Thread.sleep(3000);
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		System.out.println(courseName);
		
		//parent window
		driver.switchTo().window(parentWindow);
		WebElement name =driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		
		//to get the screenshot for particular webElement, new feature from  selenium 4
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("nameTextBox.png"));
		
		//Get the height and width for the webElement 
		int nameElementTextBoxHeight = name.getRect().getDimension().getHeight();
		int nameElementTextBoxWidth = name.getRect().getDimension().getWidth();
		System.out.println("Height: " + nameElementTextBoxHeight);
		System.out.println("Widht: " + nameElementTextBoxWidth);
		
		
		
		
		
		
		//driver.quit();
		
	}

}
