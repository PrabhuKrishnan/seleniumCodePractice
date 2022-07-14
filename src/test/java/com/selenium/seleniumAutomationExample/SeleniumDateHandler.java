package com.selenium.seleniumAutomationExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumDateHandler extends BrowserLaunch {

	 
	public void test() throws InterruptedException {
	   driver.findElement(By.cssSelector("label[for='onward_cal'][style='font-family:Lato']")).click();
	   //driver.findElement(By.xpath("//*[@id='onward_cal']")).click();;
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
	   for(WebElement dates : allDates){
		   
		  String getDate = dates.getText();
		  System.out.println("Dates: "+getDate);
		   if(getDate.equalsIgnoreCase("31")){
			   dates.click();
			   break;
		   }
			   
		   }
			   
		   
	   }
	   
		
	}
	

