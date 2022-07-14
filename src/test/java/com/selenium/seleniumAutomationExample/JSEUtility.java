package com.selenium.seleniumAutomationExample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSEUtility {
	
	
	//Flash the webElement 
	public static void flash(WebElement element, WebDriver driver)
	{
			
		String bgColor = element.getCssValue("backgroundColor");
		
		for(int i=0 ;i < 500 ; i++)
		{
			changeColor("#000000", element,driver);
			changeColor(bgColor,element,driver);
		}
		
	}
	
	
	//change the element color
	public static void changeColor(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'",element);
		
		try {
			Thread.sleep(20);
		}catch (InterruptedException e) {
			 System.out.println(e.getMessage());
		}
	}
	
	//DrawBorder or Highlight the element
	public static void highlightElement(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	
	//capture the title of the page using JSE 	
	public static String getTileByJSE(WebDriver driver)
	{
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title").toString();
		return title;
		
	}
	
	//Clicking an element by JSE
	public static void  clickElementByJS(WebElement element,WebDriver driver)
	{
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
	    js.executeScript("arguments[0].click();",element);
	}
	
	
	//Generate alert info
	public static void  generateAlert(WebDriver driver,String message)
	{
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
	    js.executeScript("alert('"+ message + "')");
	}
	
	public static void  refreshBrowserByJSE(WebDriver driver)
	{
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
	    js.executeScript("history.go(0)");
	}
	
	
	
	public static void  scrollPageDown(WebDriver driver)
	{
	 JavascriptExecutor jse =(JavascriptExecutor)driver;
	 jse.executeScript("scroll(0,400)");
	 
	}
	
	
	
	
	
	

}
