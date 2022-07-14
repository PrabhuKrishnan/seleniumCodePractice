package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalendarUITest {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test
	public void test()  {

		/*
		  To click a calendar,

		   The logic is
		   - select the month      --> compare the given month with all the month in calendar
		   - then select the date



		 */

		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='travel_date']")).click();

		String month = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
		System.out.println(month);


		//to select the given month
		if (month.contains("September 2022")) {

			WebElement nextMonth = driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']"));
			System.out.println("whileMethod: "+nextMonth);
			nextMonth.click();
		}
		else
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		// Grab common attribute//Put into list and iterate
		int dateCount = driver.findElements(By.className("day")).size();

		for (int i = 0; i < dateCount; i++) {

			String date = driver.findElements(By.className("day")).get(i).getText();

			if (date.equalsIgnoreCase("21")) {
				driver.findElements(By.className("day")).get(i).click();
				System.out.println("if statement: "+date);
				break;
			}

		}
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
