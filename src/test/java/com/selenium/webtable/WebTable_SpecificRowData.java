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

public class WebTable_SpecificRowData {
	
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
	
	//@Test
	public void Test()
	{
		
	 //tr[1]/td - fetching the first row data
	/* List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr[1]/td"));
	 for (WebElement webElement : rowData) {
		
		 String text = webElement.getText();
		 System.out.println(text);
	}*/
	 
	 List<WebElement> firstName = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[1]"));
	 List<WebElement> emailAddress = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[3]"));
	 
	  for(int i=0;i<firstName.size();i++)
	  {
		  String fName =firstName.get(i).getText();
		  
		  if(fName.equalsIgnoreCase("Iron"))
		  {
			  String eAddress = emailAddress.get(i).getText();
			  System.out.println(eAddress);
		  }
	  }
	 
		
	}
	
	//@Test
	public void getDataBasedOnFirstName() {
		
		List<WebElement>firstName = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[1]"));
		
		 List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
		 
		 for(int i=0; i<firstName.size();i++)
		 {
			 String fName = firstName.get(i).getText();
			 if(fName.equalsIgnoreCase("Yashwanth"))
			 {
				 String data = rowData.get(i).getText();
				 System.out.println(data);
			 }
			 
		 }
		
	}
	
	@Test
	public void checkPresentAndAbsentTest()
	{
		List<WebElement> firstName = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[1]"));
		//List<WebElement> presentAbsent = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr/td[4]"));
		
		
		for(int i=0;i<firstName.size();i++)
		{
			String fName = firstName.get(i).getText();
			if(fName.equalsIgnoreCase("Iron"))
			{
				WebElement presentAbsent =  driver.findElement(By.xpath("//input[@id='first' and @type='checkbox']"));
				presentAbsent.click();
				break;
				  
			}
		}
		
	}
	

	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}

}























