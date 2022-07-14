package com.selenium.ApachePOI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.*;

public class WritingExcelUsingArrayList {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet =workBook.createSheet("EmpInfo");
		
		
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		data.add(new Object[] {"EmpID","Name","Job"});
		data.add(new Object[] {101,"Prabhu","Lead"});
		data.add(new Object[] {102,"vaira","Lead"});
		data.add(new Object[] {103,"vikram","SeniorQA"});
		
		//writing the data from ArrayList to Excel file using the for each loop
		
		int rowCount=0;
		
		
		for(Object[] empData:data)
		{
			XSSFRow row =sheet.createRow(rowCount++);
			int colCount=0;
			
			for(Object value:empData)
			{
				XSSFCell cell = row.createCell(colCount++);
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			}
			
			
		}
		

		String excelFilePath = ".\\data\\empData.xlsx";
		FileOutputStream fos = new FileOutputStream(excelFilePath);
		workBook.write(fos);
		
		workBook.close();
		
		System.out.println("EmpData writed successfully...");
		
		
		
		
		
	}

}
