package com.javastreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableSortingUsingStreams {

	@SuppressWarnings("unchecked")
	@Test
	public void sortWebTable()
	{

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		//capture all webelements into List
		List<WebElement> elementsList =  driver.findElements(By.xpath("//tr/td[1]"));

		//capture text of all webElemetns into new orginial list 
		List<String> originalList = elementsList.stream()
				.map(s->s.getText())
				.collect(Collectors.toList());

		//System.out.println("Original List Values: ");
		originalList.stream().forEach(s->System.out.println(s));


		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		//System.out.println("sortedList: ");
		sortedList.stream().forEach(s->System.out.println(s));
		
		Assert.assertTrue(originalList.equals(sortedList));

		List<String>price;
		
       do
       {
    	
        List<WebElement> rows =  driver.findElements(By.xpath("//tr/td[1]"));
		price= rows.stream()
				.filter(s->s.getText().contains("Rice"))
				.map(s->getPriceVeggi(s))
				.collect(Collectors.toList());
		
		price.forEach(s->System.out.println(s));
		
		if(price.size()<1)
		{
			
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			
		}
       }while(price.size()<1);
			
				
		
	}
	
	
	public static String getPriceVeggi(WebElement s)
	{
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
	
	
	
	
	
	
	
	
	

}
