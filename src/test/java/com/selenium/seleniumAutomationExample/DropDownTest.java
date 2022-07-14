package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

 
public class DropDownTest {

	// Demo Site: https://jqueryui.com/selectmenu/

	/*
	 * 
	 * 1.First the select the xpath for the drop down 2.Pass the Xpath to the select
	 * class in selenium(select s = new select(drop_down_xpath) 3.Then with the
	 * select class reference variable call the method to perform the dropdown
	 * operation
	 * 
	 * Methods in Select class -
	 * selectByIndex(0) 
	 * selectByValue("value")
	 * selectByVisibleText("Jul") 
	 * getFirstSelectedOption()
	 * 
	 */
	WebDriver driver;

	@Test
	public void dropDownHandle() {

		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 

		WebElement month_dropDown = driver.findElement(By.cssSelector("select[name='birthday_month']"));
		

		// Select - Class
		// To select the value of DropDown
		Select month = new Select(month_dropDown);
	 
		//Methods availabe in select class
		/*
		month.isMultiple();
		
		month.selectByIndex(0);
		month.selectByValue(null);
		month.selectByVisibleText(null);
		
		month.deselectAll();
		month.deselectByIndex(0);
		month.deselectByValue(null);
		month.deselectByVisibleText(null);
		
		month.getFirstSelectedOption();
		month.getAllSelectedOptions
		month.getOptions();
		
		
		
		*/
		
	 

		// To Select value from DropDown Use following Methods
		month.selectByIndex(0);
		month.selectByValue("7");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));;
		month.selectByVisibleText("Jul");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));;
		month.selectByVisibleText("Month");
		
		//month.getFirstSelectedOption().getText();

		WebElement first_SelectionOption = month.getFirstSelectedOption();
		System.out.println("Ater_SelectedOption:  " + first_SelectionOption.getText());

		if (month.isMultiple()) {
			System.out.println("Yes- It is multi select dropdown ");
		}
		

		 month.isMultiple();
		 
		 //the below method is for webelement 
		 month_dropDown.isDisplayed();
		 month_dropDown.isEnabled();
		 month_dropDown.isSelected();
	}
 

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
