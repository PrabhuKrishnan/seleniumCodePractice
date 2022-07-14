package com.javastreams.selenium;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetProductAndPrice_Streams {

	
	@Test
	public void getProductAndPrice()
	{
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		List<WebElement> productTitle = driver.findElements(By.xpath("//h2[@class='product-title']"));
		
		List<WebElement> productPrices = driver.findElements(By.xpath("//div[@class='prices']"));
		
		HashMap<String, Double> productData =  new HashMap<>();
		
		 for(int i=0; i<productTitle.size();i++)
		 {
		   
			String pTitle =  productTitle.get(i).getText();
			Double pPrice = Double.parseDouble(productPrices.get(i).getText());
			
			productData.put(pTitle, pPrice);
		 
		 }
		 
		 /*
		 for(Map.Entry<String, Double> entry :productData.entrySet())
		 {
			 System.out.println(entry.getKey()+" " +entry.getValue());
		 }
	  */
		 
		 
		 //using streams 
		 productData.forEach((k,v)->System.out.println(k+" "+v));
		 
		 System.out.println();
		 System.out.println("Product details whose prices is >800");
		 
		 //In HashMap, to add in streams,  use entrySet and then add it to stream 
		 //Then filter the data in hasmap based on the one value, here for example filtered the value based on the price
		 productData.entrySet().stream().filter(p->p.getValue()>800).forEach(v->System.out.println(v));
		  
		 driver.quit();
		 
		 
		 
	}
}
