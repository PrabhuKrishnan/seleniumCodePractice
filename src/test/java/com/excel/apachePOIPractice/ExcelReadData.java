package com.excel.apachePOIPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		
		
		String filePath = ".\\data\\TestData.xlsx";
		FileInputStream fis = new FileInputStream(filePath);

		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		int sheetCount = workBook.getNumberOfSheets();
		System.out.println("Number of Excel Sheet: " + sheetCount);

		for (int i = 0; i < sheetCount; i++) {
			if (workBook.getSheetName(i).equalsIgnoreCase("FT")) {

				XSSFSheet sheet = workBook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();

				Iterator<Cell> cell = firstRow.cellIterator();
				int testCasecoloumnIndex = 0;

				while (cell.hasNext()) {
					Cell cellValue = cell.next();

					if (cellValue.getStringCellValue().equalsIgnoreCase("TestCases")) {
						System.out.println("TestCase coloum Header: " + cellValue);
						System.out.println("TestCase Coloumn Header Index: " + testCasecoloumnIndex);
						testCasecoloumnIndex = cellValue.getColumnIndex();

					}

				}


				while(rows.hasNext()) 
				{ 
					Row r = rows.next();
				if(r.getCell(testCasecoloumnIndex).getStringCellValue().equalsIgnoreCase("TestCases")) 
				{ 
				Iterator<Cell> c = r.cellIterator();
				while(c.hasNext()) 
				{	
					String cv = c.next().getStringCellValue();
					System.out.println(cv); 
					
					}
				}

				}



			}
		}

	}

}
