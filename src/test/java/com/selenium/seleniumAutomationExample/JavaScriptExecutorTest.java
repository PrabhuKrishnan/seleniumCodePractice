package com.selenium.seleniumAutomationExample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	
	public static void main(String[] args) throws IOException, InterruptedException {

		/*
		 * using JSE we can achieve below:

		 - Flashing an element
		 - Drawing a boarder around the element 
		 - Capture title of the page 
		 - Click in some element 
		 - Generate alert info
		 - Refreshing page
		 - scrolling page

		 */

		//		Refer the JSEUtility class for JavaScriptExecutor functions
		WebDriver driver;
		WebElement joinNowForFree;

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Flash the webElement 
		/*
		 * WebElement joinNowForFree =
		 * driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		 * JSEUtility.flash(joinNowForFree, driver);
		 */

		//Drawing a boarder around the element & screenshot 
		 joinNowForFree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		JSEUtility.highlightElement(joinNowForFree, driver);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("D://Automation Jars//screenshot/twoplugs.png");
		FileUtils.copyFile(src,target);
		
		
		//capture the title of the page using JSE 
		String title = JSEUtility.getTileByJSE(driver);
		System.out.println(title);
		
   
		//Click in some element
		//JSEUtility.clickElementByJS(joinNowForFree, driver);
		
		//Generate alert info
		//JSEUtility.generateAlert(driver, "JSE Alert");
		//Thread.sleep(2000);
			
		//Refreshing page
		//JSEUtility.refreshBrowserByJSE(driver);
		
		JSEUtility.scrollPageDown(driver);	
		
        //driver.quit();











	}

}
