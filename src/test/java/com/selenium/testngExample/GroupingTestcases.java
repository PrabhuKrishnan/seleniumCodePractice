package com.selenium.testngExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GroupingTestcases {

WebDriver driver;
	
	
	@Test(groups={"FunctionalTesting"})
	public void loginToWordPress() throws InterruptedException  
	{
		System.setProperty("webdriver.gecko.driver","H:\\Automation Testing\\SeleniumLearn\\Jars\\FirefoxGeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		Reporter.log("Driver Instance Created...");
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		Reporter.log("Orange HRM site Launched...");
		driver.findElement(By.cssSelector("input[name='txtUsername'][type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='txtPassword'][id='txtPassword']")).sendKeys("admin");
        driver.findElement(By.cssSelector("input[type='submit'][name='Submit']")).click();
        Reporter.log("Fetching Current URL");
        System.out.println(driver.getCurrentUrl()); 
		
        Reporter.log("Waiting for 5000 sec for page load", true);
        Thread.sleep(5000);

        //WebElement element = driver.findElement(By.xpath("//a/b[contains(text(),'Dashboard')]"));
       
        Reporter.log("Assterting the current url for successfull login");
        Assert.assertTrue(driver.getCurrentUrl().contains("http://opensource.demo.orangehrmlive.com/index.php/dashboard"),"User is not able to login - Invalid Credentails");
        
        System.out.println("Page title verified - User is able to login successfully");
   }
	
	@Test(groups={"RegressionTesting"})
	public void test_a()
	{
		System.out.println("Execute Test A");
	}
	
	@Test(groups={"SystemTesting"})
	public void test_b()
	{
		System.out.println("Execute Test b");
	}
	
	@Test
	public void test_c()
	{
		System.out.println("Execute Test C");
	}
	
	
	@Test(groups={"SmokeTesting"})
	public void test_d()
	{
		System.out.println("Execute Test D");
	}
	
	@Test
	public void test_e()
	{
		System.out.println("Execute Test E");
	}
	
	@Test
	public void test_f()
	{
		System.out.println("Execute Test F");
	}
	
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}

