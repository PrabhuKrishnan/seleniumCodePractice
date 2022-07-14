package com.selenium.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		
		File file = new File("H:\\Automation Testing\\SeleniumLearn\\DataFile.xlsx");
		FileInputStream fileInput =  new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		sheet.getRow(0).createCell(2).setCellValue("Pass");
		sheet.getRow(1).createCell(2).setCellValue("Fail");
		
       FileOutputStream fout = new FileOutputStream(file);
       wb.write(fout);
       fileInput.close();
       
		
	}

}
