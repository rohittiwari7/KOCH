package com.koch.utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{
	 XSSFWorkbook wb;
	
	 //Constructor
     public ExcelDataProvider()
     {
    	 File f=new File("./TestData/Data.xlsx");
    	 
  try {
			FileInputStream fis = new FileInputStream(f);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) 
		{
			e.getMessage();
		}
    	 
     }
    //Methods
		
		public String getStringData(String sheet, int row, int column)
		{
			return wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		}
		
		public String getStringData(int index,int row, int column)
		{
			return wb.getSheetAt(index).getRow(row).getCell(column).getStringCellValue();
			
		}
		
		public double getNumericData(String sheet, int row, int column)
		{
			return wb.getSheet(sheet).getRow(row).getCell(column).getNumericCellValue();
		}	 
 
}
