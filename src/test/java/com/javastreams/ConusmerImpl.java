package com.javastreams;

import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConusmerImpl {

	
	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://amazon.in");
		
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		
	    
		Consumer<WebElement> consumer = e->
		{
			if(!e.getText().isBlank())
			{
				System.out.println(e.getText());
			}
			
		};
		
		elements.forEach(consumer);
		
		driver.quit();

	}
}
