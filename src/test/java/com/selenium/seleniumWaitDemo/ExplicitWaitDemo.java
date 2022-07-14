package com.selenium.seleniumWaitDemo;

 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
 
	 public static void main(String[] args) {
		
		 WebDriver driver;
			System.setProperty(
					"webdriver.chrome.driver",
					"G:\\Profession\\Automation Files\\selenium Jars\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com/ncr"); 
			
			driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
			
			// Initialize and wait till element(link) became clickable - timeout in 10 seconds
			WebElement firstResult = new WebDriverWait(driver,30)
			        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
			
			// Print the first result
			System.out.println(firstResult.getText());
			
			firstResult.click();
		 
		 
		 
		 
	}
	 
}
