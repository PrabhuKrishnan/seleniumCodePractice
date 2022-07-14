package com.selenium.ApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.xssf.usermodel.*;

public class ExcelToHashMap {

	public static void main(String[] args) throws IOException {
		 
		
		//Reading Data from Excel and storing into the HashMap
		String excelFilePath = ".\\data\\hasMapData.xlsx";
		FileInputStream fis = new FileInputStream(excelFilePath);

		XSSFWorkbook workBook = new XSSFWorkbook(fis); 
		XSSFSheet sheet = workBook.getSheet("data"); 
		
		//Before reading the data from the excel file, we need to get the no of rows and column 
		
		int NumberOfRows = sheet.getLastRowNum(); 
		
		HashedMap<String, String> data = new HashedMap<String, String>();
		
		//Read data from Excel and store it in Hash Map
		for(int r=0;r<NumberOfRows;r++)
		{
			//reading data from the row and then getting the value of cell 
			String key = sheet.getRow(r).getCell(0).getStringCellValue();
			String value = sheet.getRow(r).getCell(1).getStringCellValue();
			
			//storing the data in to the map
			data.put(key, value);
			
		}
		
      
		//Read the data from the hashMap
		for(Map.Entry<String,String> excelData:data.entrySet())
		{
			String key = (String) excelData.getKey();
			String value = (String) excelData.getValue();
			
			System.out.println(key +" "+ value);
		}
		
		
		
		
		
		
		

	}

}
