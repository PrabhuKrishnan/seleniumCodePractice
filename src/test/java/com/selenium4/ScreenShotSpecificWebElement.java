package com.selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotSpecificWebElement {
	
	@Test
	public void getScreenshotForSpecificWebElement() throws IOException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		
		File srcFile = logo.getScreenshotAs(OutputType.FILE);
		File desFile = new File("logo.png");
		FileUtils.copyFile(srcFile, desFile);
		
		driver.quit();

	}

}
