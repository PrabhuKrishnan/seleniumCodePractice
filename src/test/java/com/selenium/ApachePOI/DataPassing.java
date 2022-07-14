package com.selenium.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;


public class DataPassing {

	@SuppressWarnings({ "resource", "unused", "rawtypes", "deprecation" })
	@Test
	public void test() throws IOException
	{
		
		//String filePath = System.getProperty("user.dir")+"\\\\\\\\src\\\\\\\\excelExportAndFileIO";
		
		File  dataFile  = new File("D:\\Users\\prabhu.k\\Desktop\\Selenim Learn\\DataHandler.xls");
		
		FileInputStream fin = new FileInputStream(dataFile);
		
		Workbook  excelFile =  new HSSFWorkbook(fin);
		
		Sheet dataSheet = excelFile.getSheet("Data");
		

		String data = dataSheet.getRow(0).getCell(0).getStringCellValue();

		String d1 = dataSheet.getRow(1).getCell(1).getStringCellValue();
		
		  
		
		System.out.println(data);
		System.out.println(d1);
		fin.close();
		
	}	
}
