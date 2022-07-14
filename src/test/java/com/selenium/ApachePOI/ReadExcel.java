package com.selenium.ApachePOI;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {

			File file = new File("H:\\Automation Testing\\SeleniumLearn\\DataFile.xlsx");
			FileInputStream fileInput = new FileInputStream(file);
			// XSSFWorkbook,XSSFSheet - class
			XSSFWorkbook wb = new XSSFWorkbook(fileInput);
			XSSFSheet sheet = wb.getSheetAt(0);
			String data = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(data);
			System.out.println();

			int rowCount = sheet.getLastRowNum();

			// It will give count 1 to 15 instead 0 to 14
			System.out.println("Total rowCount: " + (rowCount + 1));

			for (int i = 0; i < rowCount; i++) {

				String excelData = sheet.getRow(i).getCell(0).getStringCellValue();
				System.out.println(excelData);
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
