package com.javastreams.filterMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.stream.Collectors;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTableUsingStreams {

	
	@Test
	public void filterWebTable()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		

        driver.findElement(By.id("search-field")).sendKeys("Rice");

        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));

       List<WebElement> filteredList = veggies.stream()
    		   .filter(veggie->veggie.getText().contains("Rice"))
    		   .collect(Collectors.toList());

       Assert.assertEquals(veggies.size(), filteredList.size());
		
	}
}
