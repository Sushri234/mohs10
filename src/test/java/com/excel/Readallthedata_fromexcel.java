package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.apache.hc.core5.util.Args;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readallthedata_fromexcel {
	
	@Test
	public void dataReadTest() throws IOException 
	{
		FileInputStream files= new FileInputStream("C:\\Users\\DELL\\Documents\\My sheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(files);
		
		 int rowsize =wb.getSheet("Sheet1").getLastRowNum();
	        System.out.println(rowsize);
	        int cellsize= wb.getSheet("Sheet1").getRow(1).getLastCellNum();
	        System.out.println(cellsize);
	       
	        for(int i=0; i<=rowsize; i++)
	        {
	        	for(int j=0; j<cellsize; j++)
	        	{
	        		System.out.print(wb.getSheet("Sheet1").getRow(i).getCell(j) + "     ");
	        		// System.out.println(wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue());
	        	}
	        	System.out.println();
	        }    
	}
}




	
	
		