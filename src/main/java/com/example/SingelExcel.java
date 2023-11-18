package com.example;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class SingelExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("/Users/sharminahmed/eclipse-workspace/MavenDemo/testdata/Country.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(wb.getNumberOfSheets());
		int rowcount=sh.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		int columncount=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println(columncount);
		
		String[]country=new String[rowcount];
		for(int i=0;i<rowcount;i++) {
			country[i]=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(country[i]);
	}
		System.out.println(country[0]);
	}

}
