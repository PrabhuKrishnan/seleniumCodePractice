package com.selenium.seleniumAutomationExample;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebTable {

	WebDriver driver;



	@Test
	public void LoginTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		int numberOfColumnCount = driver.findElements(By.xpath("//table[@class='dataTable']//tr/th")).size();
		int numberOfRowsCount = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr")).size();

		System.out.println("Number of Column in the table: " + numberOfColumnCount);
		System.out.println("Number of Rowns in the table: " + numberOfRowsCount);
		System.out.println();


		//To print all the table data(rows,col)
		 
		  for(int i=1;i<numberOfRowsCount;i++) 
		  {
		  	 for(int j=1;j<numberOfColumnCount;j++)
		  	 {
		  		 String data =driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[4]")).getText();
		  		 System.out.println(data);
		  		 break;
		  	 }
		  }
		  
		  

 

	}





}
