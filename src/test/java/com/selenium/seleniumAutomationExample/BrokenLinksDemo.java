package com.selenium.seleniumAutomationExample;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Get all the links in the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int links_size = links.size();
		System.out.println("Link Size: " + links_size);

		// iterate all the links broken or not
		for (int i = 0; i < links_size; i++) {

			WebElement href_attribute = links.get(i);
			String hrefValue = href_attribute.getAttribute("href");

			URL url = new URL(hrefValue);

			HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
			Thread.sleep(2000);
			urlConn.connect();

			int responseCode = urlConn.getResponseCode();
			if (responseCode < 400) {
				System.out.println(url + " - " + "is not a broken URL");

			} else
				System.out.println(url + " - " + "is a broken URL");

		}

	}

}
