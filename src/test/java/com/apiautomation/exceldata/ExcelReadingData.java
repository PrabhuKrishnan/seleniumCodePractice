package com.apiautomation.exceldata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingData {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws IOException {

		/*
	 	1.Identify Testcases column by scnning the entire 1st row 
	 	2.Once coloumn is identified then scan entire testcase coloum to identify OneTImeFundtransfer
 		  testcase row 
 		3.After you grab purchase testcase row, pull all the data of that row and feed into test

	 	Note:
	 	1.For test data sheet, first we need to check the testcase  column - the test case column  present in the first row 
	 	2.Once the test case column is found,then take the particular test case and extract the data 

		 */

		String dataFilePath = ".\\data\\country.xlsx";
		FileInputStream fis = new FileInputStream(dataFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("SheetCount: " + sheetCount);

		for (int i = 0; i < sheetCount; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("country")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				//Identify Testcases column by scnning the entire 1st row 

				Iterator<Row> rows = sheet.iterator();// sheet is a collection of rows 
				Row firstRow = rows.next();  

				Iterator<Cell> cell = firstRow.cellIterator();// Row is collection of cells 

				//int k = 0; // check all the colomun to find the TestCases by incrementing the K
				int testCasecoloumnIndex = 0;

				while (cell.hasNext()) 
				{
					Cell value = cell.next();
					 

					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) 
					{
						//testCasecoloumnIndex = k;
						testCasecoloumnIndex = value.getColumnIndex();
						System.out.println("Found TestCase Colomun Header: " + value);
					}
				}
			//	k++;
				System.out.println(testCasecoloumnIndex);


				/*
				 Once coloumn is identified then scan entire testcase coloum to identify ThirdPartyFundTransfer testcase row

				 Steps:
				 1.we have the column which have the index of testcase coloumn 
				 2.After that scan the ThirdPartyFundTransfer testcase  which user need to execute 
				 3.Once the ThirdPartyFundTransfer is found 
				 4.Read the data from each cell of the ThirdPartyFundTransfer test case 

				 */
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(testCasecoloumnIndex).getStringCellValue().equalsIgnoreCase("ThirdPartyFundTransfer"))
					{
						Iterator<Cell> c = r.cellIterator();
						while(c.hasNext())
						{
							Cell cellValue = c.next();
							if(cellValue.getCellType()==CellType.STRING)
							{
								System.out.println(cellValue.getStringCellValue());
							}
							else
							{
								NumberToTextConverter.toText(cellValue.getNumericCellValue()); //NumberToTextConverter method to convert numberic value to text
								
							}
							 
						}
					}

				}




















			}

		}

	}

}
