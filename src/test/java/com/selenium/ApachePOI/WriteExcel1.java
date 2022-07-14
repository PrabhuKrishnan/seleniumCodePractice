package com.selenium.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
 

public class WriteExcel1 {

@SuppressWarnings("resource")
public void test() throws IOException{	
 
   File dataFilePath = new File("D:\\Users\\prabhu.k\\Desktop\\Selenim Learn\\DataHandler.xls");
   
   FileInputStream fin = new FileInputStream(dataFilePath);
   
   Workbook dataFile = new HSSFWorkbook(fin);
   
   Sheet dataSheet = dataFile.getSheet("DataWrite");
   
   int firstRow = dataSheet.getFirstRowNum();
   int lastRow = dataSheet.getLastRowNum();
   System.out.println("FirstRow: "+firstRow  +  " LastRow: " + lastRow ); 
   
   int rowCount = dataSheet.getLastRowNum() - dataSheet.getFirstRowNum();
   System.out.println(rowCount);
   
   Row row =  dataSheet.getRow(0);
   Row newRow = dataSheet.createRow(rowCount+1);
   

   String[] valueToWrite = {"Mr. E","Noida"};

   for(int j=0; j < row.getLastCellNum(); j++) {
	   
	   Cell cell = newRow.createCell(j);
	   cell.setCellValue(j);
   }
   
   fin.close();
   
   FileOutputStream fout = new FileOutputStream(dataFilePath);
   dataFile.write(fout);
   fout.close();

}
}
