package com.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ObjectLocation {
	
	@Test
	public void getObjectLocationForElement()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		
		int height = logo.getRect().getDimension().getHeight();
		int widht = logo.getRect().getDimension().getWidth();
		
		System.out.println("Height: "+height +"widht"+widht);
		
		int x = logo.getRect().getX();
		int y = logo.getRect().getY();
		
		System.out.println("X Location: " + x +"Y Location: "+ y);
		
		
		driver.quit();
	}

}
