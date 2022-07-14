package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) {


		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement fromDropDown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		Select select = new Select(fromDropDown);

		List<WebElement> dropDownOptinos = select.getOptions();

		for(WebElement options : dropDownOptinos )
		{
			String optionName = options.getText();
			System.out.println(optionName);
		}




	}

}   








