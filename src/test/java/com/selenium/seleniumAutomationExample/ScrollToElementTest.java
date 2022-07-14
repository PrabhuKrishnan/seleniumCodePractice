package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElementTest {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));

		//JavascriptExecutor to scroll the element until into its view 
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", element);

		System.out.println(element.getText());
		
		
		
	}

}
