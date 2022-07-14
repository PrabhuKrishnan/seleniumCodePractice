package com.selenium.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void failed(String getMethodName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			File target = new File("D://Automation Jars//screenshot/"+getMethodName+"_"+".jpg");
			FileUtils.copyFile(src, target);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
