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


//https://www.youtube.com/watch?v=ppwdJzU3iYk - Reference video
public class WebTablePractice_RediffMoney {
	
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
		
		List<WebElement> company = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]")); 
		//List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		List<WebElement>currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
		List<WebElement>change = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
		
		for(int i=0;i<company.size();i++)
		{
			String comName = company.get(i).getText();
			
			if(comName.equalsIgnoreCase("Vedanta"))
			{
				String price = currentPrice.get(i).getText();
				System.out.println(price);
				
				String changePercentage = change.get(i).getText();
				System.out.println(changePercentage);
				
			}
		}
		 
	}
	
	 

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

	 

}















