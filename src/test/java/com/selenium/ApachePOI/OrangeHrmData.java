package com.selenium.ApachePOI;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OrangeHrmData {
	
	    XSSFWorkbook wb;
	    XSSFSheet sheet;
		public  OrangeHrmData(String excelPath) 
		{
			try {
				File src = new File(excelPath);
				FileInputStream fileInput =  new FileInputStream(src);
				wb = new XSSFWorkbook(fileInput);
				
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public String getData(int sheetNum,int row ,int col)

		{
			sheet = wb.getSheetAt(sheetNum);
			String excelData = sheet.getRow(row).getCell(col).getStringCellValue();
			return excelData;
			
		}
		
		public int getrowCount(int sheetIndex)
		{
			int rowCount = wb.getSheetAt(sheetIndex).getLastRowNum();
			rowCount = rowCount+1;
			return rowCount;
		}
	}


