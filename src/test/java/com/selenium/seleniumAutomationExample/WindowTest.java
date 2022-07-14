package com.selenium.seleniumAutomationExample;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement element = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
		WebElement parentWindowPageText = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
		element.click();

		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow ID: " + parentWindow);

		Set<String> allActiveWindows = driver.getWindowHandles();

		for (String childWindow : allActiveWindows) {

			//if the parent window  is not matching with the child window, then switch to the child window 
			if (!parentWindow.equalsIgnoreCase(childWindow)) 
			{
				System.out.println("child window ID: " + childWindow);
				driver.switchTo().window(childWindow);
				String childWindowTitle = driver.getTitle();
				System.out.println(childWindowTitle);
				break;
			}
		}

		driver.switchTo().window(parentWindow);
		String parentPageText = parentWindowPageText.getText();
		System.out.println(parentPageText);
		driver.quit();

	}

}
