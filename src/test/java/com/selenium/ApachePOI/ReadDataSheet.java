package com.selenium.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.seleniumAutomationExample.BrowserLaunch;

public class ReadDataSheet extends BrowserLaunch{
       
	
 
	public  void test() throws IOException{
		
	 File  dataFile = new File("D:\\Users\\prabhu.k\\Desktop\\Selenim Learn\\DataHandler.xls");
	 
	 FileInputStream fin = new FileInputStream(dataFile);
	 
	 Workbook dataBook =  new HSSFWorkbook(fin); 
	 
	 Sheet sheet = dataBook.getSheet("Data");
	 
	 WebElement userName = driver.findElement(By.cssSelector("input[id='userName'][name='userName']"));
	 WebElement passWord = driver.findElement(By.cssSelector("input[id='password'][name='password']"));
	 
	
	 
	}
	
}
