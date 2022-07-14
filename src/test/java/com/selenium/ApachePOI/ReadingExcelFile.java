package com.selenium.ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class ReadingExcelFile {

	public static void main(String[] args) throws IOException {

		String excelFilePath = ".\\data\\country.xlsx";
		FileInputStream fis = new FileInputStream(excelFilePath);

		// to read the workbook
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		
		// get the sheet from the workbook object
		XSSFSheet sheet = workBook.getSheet("country");

		 // get the total no of rows in the sheet
		int NumberOfRows = sheet.getLastRowNum();
		
		// get the total no of columns in the sheet
		int NumberOfColumns = sheet.getRow(1).getLastCellNum(); 

		System.out.println("NumberOfRows:" + NumberOfRows + " NumberOfColumns: " + NumberOfColumns);

		
		System.out.println("=============Read the excel file using the forLoop=====================");
		
		 //Read the excel file using the forLoop
		
		// to read the rows in the sheet
		for (int r = 0; r <= NumberOfRows; r++) 
		{
			
			// before reading the cell, we need the row to read its cell
			XSSFRow row = sheet.getRow(r); 

			// to read the cells in each row 
			for (int c = 0; c < NumberOfColumns; c++)
			{
				XSSFCell cell = row.getCell(c);

				switch (cell.getCellType()) 
				{

				case STRING:
					 System.out.print(cell.getStringCellValue());
					 break;
					 
				case NUMERIC:
					 System.out.print(cell.getNumericCellValue());
					 break;
					
				case BOOLEAN:
					 System.out.print(cell.getBooleanCellValue());
					 break;
					 
				default:
					System.out.println("The cell type is not matched...");
					break;
				
				}
				System.out.print("  |  ");
			}
			System.out.println();
		}
		
		
		
		 //Read the excel file using the Iterator 
		/*
		  -need to iterate the sheet using the iterator
		  -then get the rows using the sheet iterator
		  -then read cells from the rows 
		  
		  
		 */
		
		 System.out.println("==================================Read the excel file using the Iterator============================");
		Iterator<Row> sheetIterator = sheet.iterator();
		
		while(sheetIterator.hasNext())
		{
			XSSFRow row=(XSSFRow) sheetIterator.next();
			
			Iterator<Cell> cellIterator=row.cellIterator();
			
			while(cellIterator.hasNext())
			{
				XSSFCell cell = (XSSFCell) cellIterator.next();
				
				switch (cell.getCellType()) 
				{

				case STRING:
					 System.out.print(cell.getStringCellValue());
					 break;
					 
				case NUMERIC:
					 System.out.print(cell.getNumericCellValue());
					 break;
					
				case BOOLEAN:
					 System.out.print(cell.getBooleanCellValue());
					 break;
					 
				default:
					System.out.println("The cell type is not matched...");
					break;
				
				}
				System.out.print("  |  ");
				
			}
			System.out.println();
		}
		
		
		workBook.close();

	}
}
