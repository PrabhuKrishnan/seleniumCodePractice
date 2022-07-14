package com.selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshot {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	}

	//@Test
	public void takeScreenshotOfaPage() throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File("homePage.png");
		FileUtils.copyFile(src, tgt);
		
		
	}
	
	@Test
	public void takeScreenshotOfPageSection() throws IOException
	{
		
		WebElement featureProductPageSecttion=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File src = featureProductPageSecttion.getScreenshotAs(OutputType.FILE);
		File tgt = new File("featureProducts.png");
		FileUtils.copyFile(src, tgt);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
