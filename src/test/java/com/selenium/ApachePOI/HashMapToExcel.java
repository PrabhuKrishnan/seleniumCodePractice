package com.selenium.ApachePOI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.xssf.usermodel.*;

public class HashMapToExcel {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException {
		
		
      XSSFWorkbook workBook = new XSSFWorkbook();
	  XSSFSheet sheet =workBook.createSheet("EmpInfo");
		
	  Map<String, String> data = new HashedMap<String, String>();
	  data.put("101", "prabhu");
	  data.put("102", "venkat");
	  data.put("103", "raja");
	  data.put("104", "vaira");
	  data.put("105", "vikram");
	  
	  int rowNo=0;
	  
	  for(Map.Entry entry:data.entrySet())
	  {
		  XSSFRow row = sheet.createRow(rowNo++);
		  
		  //create a call and set the key value in one cell and data in other cell
		  row.createCell(0).setCellValue((String)entry.getKey());
		  row.createCell(1).setCellValue((String)entry.getValue());
		  
	  }
	  

		String excelFilePath = ".\\data\\hasMapData.xlsx";
		FileOutputStream fos = new FileOutputStream(excelFilePath);
		workBook.write(fos);
		
		workBook.close();
		
		System.out.println("EmpData writed successfully...");
		
	}
}
