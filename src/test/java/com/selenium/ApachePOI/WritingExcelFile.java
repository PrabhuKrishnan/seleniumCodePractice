package com.selenium.ApachePOI;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
 

public class WritingExcelFile {

	
	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook workBook = new XSSFWorkbook();
		
		//to write a excel sheet, we need to create a sheet 
		XSSFSheet sheet =workBook.createSheet("EmpInfo");
		
		//with that array we need to write the below data in the "EmpInfo" sheet
		Object empData[][]= {
							{"EmpID","Name","Job"},
				            {101,"Prabhu","Lead"},
				            {102,"vaira","Lead"},
				            {103,"vikram","SeniorQA"}
		                    };
		
		/*
		//we need to find the no.of rows to write in sheet
		int numberOfRows=empData.length;
		
		//then we need to find the no.of columns in the row, for this we need to to no.of col in 1st row
		int numberOfColumns = empData[0].length;
		
		System.out.println("numberOfRows: "+numberOfRows+ " numberOfColumns: " +numberOfColumns);
		
		//writing excel file using the for loop
		
		System.out.println("writing excel file using the for loop");
		
		//to iterate the row to write the data in the cell
		for(int r=0;r<numberOfRows;r++) 
		{
			//before inserting data, we need to create the row 
			 XSSFRow row= sheet.createRow(r); 
			 
			//to iterate the column and then write the data in the cell
			for(int c=0;c<numberOfColumns;c++) 
			{
				//create the cell before writing the value 
				XSSFCell cell=row.createCell(c); 
				
				Object value=empData[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			}
		}
		
		*/
		System.out.println("==========================================================================");
		System.out.println("writing excel file using the for each loop");
		
		
		//In for each loop, we have to  rowCount=0 and then in post inc we are creating the row
		int rowCount=0;
        
		//In outer loop, we are getting the first row data and storing in emp variable
		for(Object emp[]:empData)
		{
			//creating new row in each iteration 
			XSSFRow row=sheet.createRow(rowCount++);
			
			int colCount=0;
			for(Object value:emp)
			{
				//creating the new cell in each iteration 
				XSSFCell cell=row.createCell(colCount++);
				
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
