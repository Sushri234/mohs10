package com.excel;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelinput {
	@Test
	
	public void Fileupload2() throws IOException
    {
        HSSFWorkbook workbook =new HSSFWorkbook();
           HSSFSheet sheet = workbook.createSheet();
        //   excel_until call = new excel_until();
           setCellData(sheet);
           File file = new File("C:\\Users\\DELL\\Documents\\My sheet.xls");
           workbook.write(file);
           workbook.close();
    }
	
	public static void setCellData(HSSFSheet sheet)
    {
         Scanner myObj = new Scanner(System.in);
         System.out.println("Enter a msg");
         String msg = myObj.nextLine();
         System.out.println("Enter row number");
         int row = myObj.nextInt();
         System.out.println("Enter cell number");
         int cell = myObj.nextInt();
         sheet.createRow(row);
         sheet.getRow(row).createCell(cell).setCellValue(msg);
    
        
    }

}
