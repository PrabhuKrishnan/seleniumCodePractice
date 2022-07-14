package com.selenium.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable_ReadAllRows_Columns {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setUpTest()
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/companies/most-traded/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	
	@Test
	public void Test()
	{
		
	 List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	 int rowSize = rows.size();
	 
	 List<WebElement> col =  driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
	 int colSize = col.size();
	 
	 System.out.println("Data from Table: ");
	 for(int i=1;i<rowSize;i++)
	 {
		 for(int j=1;j<colSize;j++)
		 {
			 String data = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
			 System.out.println(data);
		 }
		 System.out.println();
	 }
	
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

	
	}

  
	 
















