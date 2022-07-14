package com.javastreams.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FindLinksHrefNullCheck_Streams {


	@Test
	public void getWorkingLinksInPage() throws InterruptedException  
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");


		List<WebElement> listElements = driver.findElements(By.tagName("a"));

		System.out.println("Total no of link count: " +  listElements.size());

		//print all the links in the webpage  
		listElements.forEach(l->System.out.println(l.getText()));

		long workingLinks =
				listElements.stream()
				.filter(l->l.getAttribute("href")!=null)
				.count();
		
		System.out.println("working links count: " + workingLinks );


		driver.close();

	}
}
