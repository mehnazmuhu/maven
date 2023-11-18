package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcountry {

	public static String[] exceldata() throws IOException{
		FileInputStream fis = new FileInputStream("/Users/sharminahmed/eclipse-workspace/MavenDemo/testdata/Country.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(wb.getNumberOfSheets());
		int rowcount=sh.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		int columncount=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println(columncount);
		
		String[]data=new String[rowcount];
		
		for(int i=0;i<rowcount;i++) {
			data[i]=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data[i]);
	}
		return data;
		
		//Row r=sh.getRow(0);
		//Cell c==sh.getCell(0);
		//System.out.println(sh.getrow().getCell().getStringCellValue());
	}
	}
