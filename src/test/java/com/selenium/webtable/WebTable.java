package com.selenium.webtable;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WebTable {

	WebDriver driver;

	@BeforeTest
	public void setUpTest()
	{

		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test
	public void Test()
	{
		//print all the data in the table
		WebElement table = driver.findElement(By.id("simpletable")); 

		/* List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) 
		{
			 String text = header.getText();
			 System.out.println(text);
		} */	

		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		int size = allrows.size();
		//System.out.println("Rows size: "+size);

		/*for (WebElement row : allrows) {

			List<WebElement> colums  = row.findElements(By.tagName("td"));
			WebElement firstColumn  = colums.get(0);
			System.out.println(firstColumn.getText());
		}*/

		for (int i = 0; i < size; i++) 
		{
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
			WebElement lastname = rows.get(1);
			String text = lastname.getText();
			System.out.println(text);
			
			if(text.equals("Chatterjee"))
			{
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				input.click();
				break;
			}
		}


		}

		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}













	}
