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

public class CheckBox {

	 

		WebDriver driver;

		@Test
		public void test() {
			System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/selenium/webform/radio.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			List<WebElement> checkBox = driver
					.findElements(By.xpath("//input[@type='checkbox' and  @name='webform']"));

			System.out.println("learing the check box in automation");

			for (WebElement elements : checkBox) {
				String value = elements.getAttribute("value");
				System.out.println(value);
				
				
				//if (value.equalsIgnoreCase("checkbox3")) {
				if (elements.isDisplayed() && value.equalsIgnoreCase("checkbox3"))
					elements.click();
					break;
			}

		}

	@AfterTest
	public void tear_down() {
		driver.close();
	}
}

