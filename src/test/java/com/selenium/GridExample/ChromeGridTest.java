package com.selenium.GridExample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		
		System.out.println("Selenium Gird setup example");
		
		
		// 1.Define DesiredCapabilities for Grid
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		// 2. Chrome Options Definition 
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = "http://192.168.0.107:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		
	}
}
