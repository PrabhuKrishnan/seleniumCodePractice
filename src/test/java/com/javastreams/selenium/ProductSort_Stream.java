  package com.javastreams.selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductSort_Stream {
	
	
	@Test
	public void productSort()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Books']")).click();
		
		WebElement productDropDown = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select select = new Select(productDropDown);
		select.selectByVisibleText("Name: A to Z");
		
		List<WebElement> product_items = driver.findElements(By.xpath("//h2[@class='product-title']"));
		
		List<String> beforeSort =  product_items.stream().map(e->e.getText()).collect(Collectors.toList());
		List<String> afterSort = product_items.stream().map(e->e.getText()).sorted().collect(Collectors.toList());
		
		if (beforeSort.equals(afterSort)) {
			
			System.out.println("products are sorted");
			
		}
		else
		{
			
			System.out.println("product are  not sorted");
		}
		
		
		driver.quit();
		
	}
	
	

}
