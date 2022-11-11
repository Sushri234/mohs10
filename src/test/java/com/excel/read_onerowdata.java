package com.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class read_onerowdata {
	
	
	@Test
	public void dataReadTest() throws IOException 
	{
		FileInputStream files= new FileInputStream("C:\\Users\\DELL\\Documents\\My sheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(files);
		
		 int size =wb.getSheet("Sheet1").getLastRowNum();
	        System.out.println(size);
	        int cellsize= wb.getSheet("Sheet1").getRow(1).getLastCellNum();
	        System.out.println(cellsize);
	        for(int i=0;i<size;i++) {
	            
	        System.out.println(wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue());
	       /* }
	
           for(int j=0;j<size;j++)
           {
          System.out.println(wb.getSheet("Sheet1").getRow(j).getCell(1).getStringCellValue());
          }
         for(int k=0;k<size;k++)
         {
    	 System.out.println(wb.getSheet("Sheet1").getRow(k).getCell(2).getStringCellValue());  */      	
         }

}
}
