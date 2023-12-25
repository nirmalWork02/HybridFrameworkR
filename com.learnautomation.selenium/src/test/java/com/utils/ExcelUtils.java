package com.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static String path=System.getProperty("user.dir");
	public static XSSFWorkbook W1;
	public static XSSFSheet S1;
	public static int rowCount;
	public static int colCount;
	public static void main(String[] args) {
		getRowCount();
		getCellCount();
		
	}
	public static void getRowCount() {
		

		
		try {
			W1 = new XSSFWorkbook(path+"\\ExcelFiles\\Login1.xlsx");
			S1=W1.getSheetAt(0);
			rowCount=S1.getPhysicalNumberOfRows();
			System.out.println("Nuumber of rows "+rowCount);
			colCount =S1.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of Columns "+colCount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getCause();
			e.getMessage();
			e.printStackTrace();
		}
		
		
	}
	public static void getCellCount() {
		for(int i=1;i<=rowCount-1;i++) {
			for(int j=0;j<colCount;j++) {
		
		String cellData=S1.getRow(i).getCell(j).getStringCellValue();
		System.out.print(cellData+"||");
			}
			System.out.println();
		}
	}

}
