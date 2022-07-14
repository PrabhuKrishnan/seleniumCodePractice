package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class RadioButtonHandler {

	
	WebDriver driver;

	@Test
	public void dropDownHandle() {

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio' and @name='optradio']"));
		
		for(WebElement elements : radioButton)
		{
			String value =   elements.getAttribute("value");
			System.out.println("Radion Button Value: "+ value);
			
			if(value.equalsIgnoreCase("Male"))
			{
				//Once find the value, break the look. No need to iterate all the values in list
				elements.click();
				break;
			}
		}
		
	}
	@AfterTest
	public void tear_down()
	{
		driver.close();
	}

}
