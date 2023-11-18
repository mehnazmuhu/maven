package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLogin {
	public static String[][] exceldata() throws IOException{
		FileInputStream fis = new FileInputStream("/Users/sharminahmed/eclipse-workspace/MavenDemo/testdata/login.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		System.out.println(wb.getNumberOfSheets());
		int rowcount=sh.getPhysicalNumberOfRows();
		
		System.out.println("Total rows :" +rowcount);
		
		int columncount=sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total column : " +columncount);
		
		String[][]data=new String[rowcount][columncount];
		
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				data [i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
		
		}
	}

