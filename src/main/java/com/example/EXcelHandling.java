package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXcelHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//locate the excel file using fileinputStream
		FileInputStream fis = new FileInputStream("/Users/sharminahmed/eclipse-workspace/MavenDemo/testdata/nayika.xlsx");
		//xssFworkbook is used to handle .xlsx files
		//.xls->hssfworkbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println(wb.getNumberOfSheets());
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		int rowcount =sh.getPhysicalNumberOfRows();
		int colcount =sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total Number : " +rowcount);
		System.out.println("Total Number : " + colcount);
		 
		/*System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(3).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(4).getCell(0).getStringCellValue());*/
		
	/*	for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
			System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
			}
		System.out.println();
	}*/
		
		DataFormatter df = new DataFormatter();
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				System.out.println(df.formatCellValue(sh.getRow(i).getCell(j)));
				System.out.print(" ");
			}
			System.out.println();
			System.out.println("       ");
		}
	}
}
